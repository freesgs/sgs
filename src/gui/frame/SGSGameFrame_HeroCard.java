package gui.frame;

/**
 * Created by Free on 2015/01/03.
 */
public class SGSGameFrame_HeroCard extends SGSBaseFrame {
    public static final String CLASS = SGSGameFrame_HeroCard.class.getSimpleName(); // Thread.currentThread().getStackTrace()[1].getClassName();

    private static SGSGameFrame_HeroCard ourInstance = new SGSGameFrame_HeroCard();

    private SGSGameFrame_HeroCard() {
    }

    public static SGSGameFrame_HeroCard getInstance() {
        return ourInstance;
    }

    @Override
    public void displayFrame(String FROM_CLASS, String FROM_METHOD) {
    }
}
