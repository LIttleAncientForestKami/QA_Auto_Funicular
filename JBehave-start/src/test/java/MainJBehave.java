import org.jbehave.core.embedder.Embedder;

import java.util.Arrays;
import java.util.List;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class MainJBehave {

    private static Embedder embedder = new Embedder();
    private static List<String> storyPaths = Arrays
            .asList("square_2.story");

    public static void main(String[] args) {
        embedder.candidateSteps().add(new SquareSteps());
        embedder.runStoriesAsPaths(storyPaths);
    }
}
