package gui.frame;

import game.*;
import gui.control.swingex.SGSImageLabel;
import log.Log;

/**
 * Created by Free on 2014/12/31.
 */
public class SGSBeforeGameFrame_OK {
    public static final String CLASS = SGSBeforeGameFrame_OK.class.getSimpleName(); // Thread.currentThread().getStackTrace()[1].getClassName();
    private static SGSBeforeGameFrame sgsBeforeGameFrame = SGSBeforeGameFrame.getInstance();

    public static void click(String FROM_CLASS, String FROM_METHOD) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        try {
            Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

            if (GameMode.RANDOM.index == sgsBeforeGameFrame.cmbGameMode.getSelectedIndex()) {
                sgsBeforeGameFrame.cmbGameMode.setSelectedIndex(SGS.random(1, sgsBeforeGameFrame.cmbGameMode.getItemCount() - 1));
            }
            sgsBeforeGameFrame.cmbGameMode.setSelectedIndex(GameMode.MMMRRRRT.index); // Debug

            int playerNumbers = GameMode.getPlayerNumbers(CLASS, METHOD, sgsBeforeGameFrame.cmbGameMode.getSelectedIndex());
            int monarchNumbers = GameMode.getMonarchNumbers(CLASS, METHOD, sgsBeforeGameFrame.cmbGameMode.getSelectedIndex());
            int ministerNumbers = GameMode.getMinisterNumbers(CLASS, METHOD, sgsBeforeGameFrame.cmbGameMode.getSelectedIndex());
            int rebelNumbers = GameMode.getRebelNumbers(CLASS, METHOD, sgsBeforeGameFrame.cmbGameMode.getSelectedIndex());
            int turncoatNumbers = GameMode.getTurncoatNumbers(CLASS, METHOD, sgsBeforeGameFrame.cmbGameMode.getSelectedIndex());

            if (playerNumbers != monarchNumbers + ministerNumbers + rebelNumbers + turncoatNumbers) {
                Log.write("playerNumbers != monarchNumbers + ministerNumbers + rebelNumbers + turncoatNumbers");
                return;
            } else {
                Log.write("playerNumbers == monarchNumbers + ministerNumbers + rebelNumbers + turncoatNumbers");
            }

            for (int index = 1; index < sgsBeforeGameFrame.rdoSeatNo.length; index++) {
                if (sgsBeforeGameFrame.rdoSeatNo[index].isSelected() && index > playerNumbers) {
                    sgsBeforeGameFrame.rdoSeatNo[0].setSelected(true);
                    break;
                }
            }
            if (sgsBeforeGameFrame.rdoSeatNo[0].isSelected()) {
                sgsBeforeGameFrame.rdoSeatNo[SGS.random(1, playerNumbers)].setSelected(true);
            }

            String sgsGameFrame_BGImagePathname = "";
            String kingdom = "";
            if (sgsBeforeGameFrame.rdoKingdom[0].isSelected()) {
                int index = SGS.random(1, sgsBeforeGameFrame.rdoKingdom.length - 1);
                sgsBeforeGameFrame.rdoKingdom[index].setSelected(true);
                kingdom = sgsBeforeGameFrame.rdoKingdom[index].getText();
                sgsGameFrame_BGImagePathname = Kingdom.getBGImagePathname(CLASS, METHOD, Kingdom.RANDOM.index);
            } else {
                for (int index = 1; index < sgsBeforeGameFrame.rdoKingdom.length; index++) {
                    if (sgsBeforeGameFrame.rdoKingdom[index].isSelected()) {
                        kingdom = sgsBeforeGameFrame.rdoKingdom[index].getText();
                        sgsGameFrame_BGImagePathname = Kingdom.getBGImagePathname(CLASS, METHOD, index);
                        break;
                    }
                }
            }

            if (RoleCard.RANDOM.index == sgsBeforeGameFrame.cmbRoleCard[0].getSelectedIndex()) {
                for (int index = 0; index < sgsBeforeGameFrame.cmbRoleCard.length; index++) {
                    sgsBeforeGameFrame.cmbRoleCard[index].setSelectedIndex(1);
                }
            }

            if (HeroCard.RANDOM.index == sgsBeforeGameFrame.cmbHeroCard[0].getSelectedIndex()) {
                for (int index = 0; index < sgsBeforeGameFrame.cmbHeroCard.length; index++) {
                    sgsBeforeGameFrame.cmbHeroCard[index].setSelectedIndex(SGS.random(1, sgsBeforeGameFrame.cmbHeroCard[index].getItemCount() - 1));
                }
            }

            SGSGameFrame sgsGameFrame = new SGSGameFrame();
            sgsGameFrame.lblFrameBG.setIcon(SGSImageLabel.getImageIcon(CLASS, METHOD, sgsGameFrame.FRAME_WIDTH, sgsGameFrame.FRAME_HEIGHT, sgsGameFrame_BGImagePathname));
            sgsGameFrame.displayFrame(CLASS, METHOD);
            SGSBeforeGameFrame.getInstance().setVisibleEx(CLASS, METHOD, false);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
        }
    }
}
