package annotations;

import io.qameta.htmlelements.context.Context;
import io.qameta.htmlelements.exception.WebPageException;
import io.qameta.htmlelements.extension.MethodHandler;
import io.qameta.htmlelements.util.WebDriverUtils;
import org.hamcrest.Matcher;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import static io.qameta.htmlelements.context.Store.DRIVER_KEY;

public @interface IsAtPageMethod {

    class Extension implements MethodHandler {

        @Override
        public Object handle(Context context, Object proxy, Method method, Object[] args) {
            WebDriver driver = context.getStore().get(DRIVER_KEY, WebDriver.class)
                    .orElseThrow(() -> new WebPageException("HtmlElements handler: WebDriver missing!"));

            String pageNotLoadedMessage = getLoadTimeoutDetails(args);
            Matcher<String> urlMatcher = getUrlMatcher(args);

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return proxy;
        }

        private static String getLoadTimeoutDetails(final Object[] args) {
            String url = args != null && args.length > 0 ? String.valueOf(args[0]) : null;
            return String.format("Page \"%s\" was not loaded in %s seconds!", url, 30); // TODO: Create timeout as configurable property
        }

        private static Matcher<String> getUrlMatcher(final Object... args) {
            return args != null && args.length > 0 ? (Matcher<String>) args[0] : null;
        }
    }

}
