package framework;

import org.jbehave.core.junit.JUnitStories;

import java.util.List;

public class JBehaveStoriesRunner extends JUnitStories {
    @Override
    protected List<String> storyPaths() {
        //StoryFinder().findPaths("/Users/ebykov/IdeaProjects/ui-automation-framework/src/main/resources");
        return null;
    }
}
