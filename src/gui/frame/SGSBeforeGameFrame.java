package gui.frame;

import game.*;
import gui.control.swingex.*;
import log.Log;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Free on 2014/12/31.
 */
public class SGSBeforeGameFrame extends SGSBaseFrame {
    public static final String CLASS = SGSBeforeGameFrame.class.getSimpleName(); // Thread.currentThread().getStackTrace()[1].getClassName();
    public static final String METHOD = CLASS;

    private static SGSBeforeGameFrame ourInstance = new SGSBeforeGameFrame();

    protected SGSButton btnOK =
            new SGSButton(CLASS, METHOD, FRAME_WIDTH - 75, FRAME_HEIGHT - 30, 65, 20, "OK");

    protected SGSTextLabel lblGameMode =
            new SGSTextLabel(CLASS, METHOD, 20, 147, 60, 20, GameMode.CAPTION, Color.YELLOW);
    protected SGSComboBox cmbGameMode =
            new SGSComboBox(CLASS, METHOD, 75, 150, 210, 20, GameMode.itemArray);
    protected SGSTextLabel lblOperateTime =
            new SGSTextLabel(CLASS, METHOD, 290, 147, 60, 20, OperateTime.CAPTION, Color.YELLOW);
    protected SGSComboBox cmbOperateTime =
            new SGSComboBox(CLASS, METHOD, 350, 150, 100, 20, OperateTime.itemArray);

    protected SGSTextLabel lblCardPack =
            new SGSTextLabel(CLASS, METHOD, 20, 175, 60, 20, CardPack.CAPTION, Color.YELLOW);
    protected SGSCheckBox[] chkCardPack = {
            new SGSCheckBox(CLASS, METHOD, 70, 175, 70, 20, CardPack.STANDARD.text, Color.YELLOW),
            new SGSCheckBox(CLASS, METHOD, 130, 175, 70, 20, CardPack.BATTLE.text, Color.YELLOW),};

    protected SGSTextLabel lblHeroPack =
            new SGSTextLabel(CLASS, METHOD, 20, 200, 60, 20, HeroPack.CAPTION, Color.YELLOW);
    protected SGSCheckBox[] chkHeroPack = {
            new SGSCheckBox(CLASS, METHOD, 70, 200, 70, 20, HeroPack.STANDARD.text, Color.YELLOW),
            new SGSCheckBox(CLASS, METHOD, 130, 200, 40, 20, HeroPack.WIND.text, Color.YELLOW),
            new SGSCheckBox(CLASS, METHOD, 170, 200, 40, 20, HeroPack.FIRE.text, Color.YELLOW),
            new SGSCheckBox(CLASS, METHOD, 210, 200, 40, 20, HeroPack.WOOD.text, Color.YELLOW),
            new SGSCheckBox(CLASS, METHOD, 250, 200, 40, 20, HeroPack.HILL.text, Color.YELLOW),
            new SGSCheckBox(CLASS, METHOD, 290, 200, 45, 20, HeroPack.SP.text, Color.YELLOW),
            new SGSCheckBox(CLASS, METHOD, 335, 200, 60, 20, HeroPack.SP2.text, Color.YELLOW),
            new SGSCheckBox(CLASS, METHOD, 70, 225, 80, 20, HeroPack.OVER_KNIGHT_FAME.text, Color.YELLOW),
            new SGSCheckBox(CLASS, METHOD, 170, 225, 80, 20, HeroPack.OVER_KNIGHT_FAME_2012.text, Color.YELLOW),
            new SGSCheckBox(CLASS, METHOD, 250, 225, 80, 20, HeroPack.OVER_KNIGHT_FAME_2013.text, Color.YELLOW),};

    protected SGSButtonGroup grpSeatNo = new SGSButtonGroup(CLASS, METHOD);
    protected SGSRadioButton[] rdoSeatNo = {
            new SGSRadioButton(CLASS, METHOD, 0, 250, 80, 20, SeatNo.RANDOM.text, Color.YELLOW),
            new SGSRadioButton(CLASS, METHOD, 85, 250, 65, 20, SeatNo.NO1.text, Color.YELLOW),
            new SGSRadioButton(CLASS, METHOD, 155, 250, 65, 20, SeatNo.NO2.text, Color.YELLOW),
            new SGSRadioButton(CLASS, METHOD, 225, 250, 65, 20, SeatNo.NO3.text, Color.YELLOW),
            new SGSRadioButton(CLASS, METHOD, 295, 250, 65, 20, SeatNo.NO4.text, Color.YELLOW),
            new SGSRadioButton(CLASS, METHOD, 365, 250, 65, 20, SeatNo.NO5.text, Color.YELLOW),
            new SGSRadioButton(CLASS, METHOD, 435, 250, 65, 20, SeatNo.NO6.text, Color.YELLOW),
            new SGSRadioButton(CLASS, METHOD, 505, 250, 65, 20, SeatNo.NO7.text, Color.YELLOW),
            new SGSRadioButton(CLASS, METHOD, 575, 250, 65, 20, SeatNo.NO8.text, Color.YELLOW),};

    protected SGSTextLabel lblRoleCard =
            new SGSTextLabel(CLASS, METHOD, 20, 272, 60, 20, RoleCard.CAPTION, Color.YELLOW);
    protected SGSComboBox[] cmbRoleCard = {
            new SGSComboBox(CLASS, METHOD, 75, 275, 65, 20, RoleCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 145, 275, 65, 20, RoleCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 215, 275, 65, 20, RoleCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 285, 275, 65, 20, RoleCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 355, 275, 65, 20, RoleCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 425, 275, 65, 20, RoleCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 495, 275, 65, 20, RoleCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 565, 275, 65, 20, RoleCard.itemArray),};

    protected SGSTextLabel lblHeroCard =
            new SGSTextLabel(CLASS, METHOD, 20, 297, 60, 20, HeroCard.CAPTION, Color.YELLOW);
    protected SGSComboBox[] cmbHeroCard = {
            new SGSComboBox(CLASS, METHOD, 75, 300, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 145, 300, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 215, 300, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 285, 300, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 355, 300, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 425, 300, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 495, 300, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 565, 300, 65, 20, HeroCard.itemArray),};
    protected SGSComboBox[] cmbHeroCard2 = {
            new SGSComboBox(CLASS, METHOD, 75, 325, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 145, 325, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 215, 325, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 285, 325, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 355, 325, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 425, 325, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 495, 325, 65, 20, HeroCard.itemArray),
            new SGSComboBox(CLASS, METHOD, 565, 325, 65, 20, HeroCard.itemArray),};

    protected SGSButtonGroup grpKingdom = new SGSButtonGroup(CLASS, METHOD);
    protected SGSRadioButton[] rdoKingdom = {
            new SGSRadioButton(CLASS, METHOD, 0, 350, 80, 20, Kingdom.RANDOM.text, Color.YELLOW),
            new SGSRadioButton(CLASS, METHOD, 85, 350, 65, 20, Kingdom.WEI.text, Color.YELLOW),
            new SGSRadioButton(CLASS, METHOD, 155, 350, 65, 20, Kingdom.SHU.text, Color.YELLOW),
            new SGSRadioButton(CLASS, METHOD, 225, 350, 65, 20, Kingdom.WU.text, Color.YELLOW),
            new SGSRadioButton(CLASS, METHOD, 295, 350, 65, 20, Kingdom.QUN.text, Color.YELLOW),};

    private SGSBeforeGameFrame() {
        String FROM_CLASS = CLASS;
        String FROM_METHOD = METHOD;
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        getLayeredPane().add(lblGameMode, 0);
        getLayeredPane().add(cmbGameMode, 0);
        getLayeredPane().add(lblOperateTime, 0);
        getLayeredPane().add(cmbOperateTime, 0);

        getLayeredPane().add(lblCardPack, 0);
        for (SGSCheckBox e : chkCardPack) {
            getLayeredPane().add(e, 0);
        }

        getLayeredPane().add(lblHeroPack, 0);
        for (SGSCheckBox e : chkHeroPack) {
            getLayeredPane().add(e, 0);
        }

        rdoSeatNo[0].setSelected(true);
        for (SGSRadioButton e : rdoSeatNo) {
            getLayeredPane().add(e, 0);
            grpSeatNo.add(e);
        }

        getLayeredPane().add(lblRoleCard, 0);
        for (SGSComboBox e : cmbRoleCard) {
            getLayeredPane().add(e, 0);
        }

        getLayeredPane().add(lblHeroCard, 0);
        for (SGSComboBox e : cmbHeroCard) {
            getLayeredPane().add(e, 0);
        }
        for (SGSComboBox e : cmbHeroCard2) {
            getLayeredPane().add(e, 0);
        }

        rdoKingdom[0].setSelected(true);
        for (SGSRadioButton e : rdoKingdom) {
            getLayeredPane().add(e, 0);
            grpKingdom.add(e);
        }

        Log.write("getLayeredPane().add(btnOK, 0);");
        getLayeredPane().add(btnOK, 0);
        btnOK.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String FROM_CLASS = "MouseAdapter";
                String FROM_METHOD = "mouseClicked";
                String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
                Log.write(FROM_CLASS, FROM_METHOD, CLASS + "." + btnOK.getText(), METHOD, Log.S);
                Log.write("MouseBUTTON = [" + e.getButton() + "]");

                if (e.getButton() == MouseEvent.BUTTON1) {
                    writeLog("before:" + SGSBeforeGameFrame_OK.class.getSimpleName() + ".click");
                    SGSBeforeGameFrame_OK.click(CLASS + "." + btnOK.getText(), METHOD);
                    writeLog("after:" + SGSBeforeGameFrame_OK.class.getSimpleName() + ".click");
                }

                Log.write(FROM_CLASS, FROM_METHOD, CLASS + "." + btnOK.getText(), METHOD, Log.E);
            }
        });

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    public static SGSBeforeGameFrame getInstance() {
        return ourInstance;
    }

    private void writeLog(String before_or_after_msg) {
        Log.write("↓↓↓" + before_or_after_msg + "↓↓↓");

        Log.write(lblGameMode.getText() + ":" + cmbGameMode.getSelectedItem());
        Log.write(lblOperateTime.getText() + ":" + cmbOperateTime.getSelectedItem());
        for (SGSCheckBox checkBox : chkCardPack) {
            Log.write(lblCardPack.getText() + " " + checkBox.getText() + ":" + checkBox.isSelected());
        }
        for (SGSCheckBox checkBox : chkHeroPack) {
            Log.write(lblHeroPack.getText() + " " + checkBox.getText() + ":" + checkBox.isSelected());
        }
        for (SGSRadioButton radio : rdoSeatNo) {
            if (radio.isSelected()) {
                Log.write(radio.getText() + ":" + radio.isSelected());
            }
        }
        Log.write(lblRoleCard.getText() + "[0-" + cmbRoleCard.length + "]");
        for (SGSComboBox combo : cmbRoleCard) {
            Log.write(combo.getSelectedItem());
        }
        Log.write(lblHeroCard.getText() + "[0-" + cmbHeroCard.length + "]");
        for (SGSComboBox combo : cmbHeroCard) {
            Log.write(combo.getSelectedItem());
        }
        for (SGSRadioButton radio : rdoKingdom) {
            if (radio.isSelected()) {
                Log.write(radio.getText() + ":" + radio.isSelected());
            }
        }

        Log.write("↑↑↑" + before_or_after_msg + "↑↑↑");
    }

    @Override
    public void displayFrame(String FROM_CLASS, String FROM_METHOD) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);
        getInstance().setVisibleEx(CLASS, METHOD, true);
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }
}
