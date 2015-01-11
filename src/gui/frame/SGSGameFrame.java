package gui.frame;

import game.HeroCard;
import gui.control.swingex.SGSImageLabel;
import image.ImageDefine;
import log.Log;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Free on 2015/01/11.
 */
public class SGSGameFrame extends SGSBaseFrame {
    public static final String CLASS = SGSGameFrame.class.getSimpleName(); // Thread.currentThread().getStackTrace()[1].getClassName();
    public static final String METHOD = CLASS;

    private static SGSBeforeGameFrame sgsBeforeGameFrame = SGSBeforeGameFrame.getInstance();
    private static int index = 0;
    protected float SCALE = 1.6F;
    protected int DASHBOARD_AVATAR_WIDTH = (int) (171 / SCALE);
    protected int DASHBOARD_EQUIP_WIDTH = (int) (164 / SCALE);
    protected int DASHBOARD_HEIGHT = (int) (170 / SCALE);
    protected int PLATTER_BG_WIDTH = (int) (106 / SCALE);
    protected int PLATTER_BG_HEIGHT = (int) (168 / SCALE);
    protected int CONFIRM_WIDTH = (int) (61 / SCALE);
    protected int CONFIRM_HEIGHT = (int) (75 / SCALE);
    protected int DISCARD_WIDTH = (int) (33 / SCALE);
    protected int DISCARD_HEIGHT = (int) (81 / SCALE);
    protected int CANCEL_WIDTH = (int) (61 / SCALE);
    protected int CANCEL_HEIGHT = (int) (73 / SCALE);
    protected int ROLE_WIDTH = (int) ((25 + 17) / SCALE);
    protected int ROLE_HEIGHT = (int) ((26 + 18) / SCALE);
    protected int TRUST_WIDTH = (int) ((36 + 6) / SCALE);
    protected int TRUST_HEIGHT = (int) ((35 + 7) / SCALE);
    protected int PHOTO_BACK_WIDTH = (int) (157 / SCALE);
    protected int PHOTO_BACK_HEIGHT = (int) (181 / SCALE);
    protected int AVATAR_SIZE = (int) ((120 - 25) / SCALE);
    protected int AVATAR_X = PHOTO_BACK_WIDTH - AVATAR_SIZE;
    protected int AVATAR_Y = 15;
    protected SGSImageLabel lblAvatar = new SGSImageLabel(CLASS, METHOD, FRAME_WIDTH - DASHBOARD_AVATAR_WIDTH, FRAME_HEIGHT - DASHBOARD_HEIGHT, (int) (AVATAR_SIZE * SCALE), (int) (AVATAR_SIZE * SCALE), ImageDefine.SYSTEM_SHENCC);
    protected SGSImageLabel lblDashboardAvatar = new SGSImageLabel(CLASS, METHOD, FRAME_WIDTH - DASHBOARD_AVATAR_WIDTH, FRAME_HEIGHT - DASHBOARD_HEIGHT, DASHBOARD_AVATAR_WIDTH, DASHBOARD_HEIGHT, ImageDefine.SYSTEM_DASHBOARD_AVATAR);
    protected SGSImageLabel lblDashboardEquip = new SGSImageLabel(CLASS, METHOD, 0, FRAME_HEIGHT - DASHBOARD_HEIGHT, DASHBOARD_EQUIP_WIDTH, DASHBOARD_HEIGHT, ImageDefine.SYSTEM_DASHBOARD_EQUIP);
    protected SGSImageLabel lblDashboardHand = new SGSImageLabel(CLASS, METHOD, 0, FRAME_HEIGHT - DASHBOARD_HEIGHT, FRAME_WIDTH - DASHBOARD_AVATAR_WIDTH, DASHBOARD_HEIGHT, ImageDefine.SYSTEM_DASHBOARD_HAND);
    protected SGSImageLabel lblPlatterBg = new SGSImageLabel(CLASS, METHOD, FRAME_WIDTH - DASHBOARD_AVATAR_WIDTH - PLATTER_BG_WIDTH, FRAME_HEIGHT - PLATTER_BG_HEIGHT, PLATTER_BG_WIDTH, PLATTER_BG_HEIGHT, ImageDefine.SYSTEM_BUTTON_PLATTER_BG);
    protected SGSImageLabel lblConfirm = new SGSImageLabel(CLASS, METHOD, FRAME_WIDTH - DASHBOARD_AVATAR_WIDTH - PLATTER_BG_WIDTH + 3, FRAME_HEIGHT - PLATTER_BG_HEIGHT + 3, CONFIRM_WIDTH, CONFIRM_HEIGHT, ImageDefine.SYSTEM_BUTTON_PLATTER_CONFIRM_NORMAL);
    protected SGSImageLabel lblDiscard = new SGSImageLabel(CLASS, METHOD, FRAME_WIDTH - DASHBOARD_AVATAR_WIDTH - DISCARD_WIDTH - 2, FRAME_HEIGHT - PLATTER_BG_HEIGHT + 27, DISCARD_WIDTH, DISCARD_HEIGHT, ImageDefine.SYSTEM_BUTTON_PLATTER_DISCARD_NORMAL);
    protected SGSImageLabel lblCancel = new SGSImageLabel(CLASS, METHOD, FRAME_WIDTH - DASHBOARD_AVATAR_WIDTH - PLATTER_BG_WIDTH + 2, FRAME_HEIGHT - PLATTER_BG_HEIGHT + CONFIRM_HEIGHT + 11, CANCEL_WIDTH, CANCEL_HEIGHT, ImageDefine.SYSTEM_BUTTON_PLATTER_CANCEL_NORMAL);
    protected SGSImageLabel lblRole = new SGSImageLabel(CLASS, METHOD, FRAME_WIDTH - DASHBOARD_AVATAR_WIDTH - DISCARD_WIDTH - 8, FRAME_HEIGHT - PLATTER_BG_HEIGHT, ROLE_WIDTH, ROLE_HEIGHT, ImageDefine.SYSTEM_ROLES_UNKNOWN);
    protected SGSImageLabel lblTrust = new SGSImageLabel(CLASS, METHOD, FRAME_WIDTH - DASHBOARD_AVATAR_WIDTH - DISCARD_WIDTH - 8, FRAME_HEIGHT - TRUST_HEIGHT, TRUST_WIDTH, TRUST_HEIGHT, ImageDefine.SYSTEM_BUTTON_PLATTER_TRUST_DISABLED);
    protected SGSImageLabel lblPhotoBackArray[] = {
            new SGSImageLabel(CLASS, METHOD, 0, (FRAME_HEIGHT - DASHBOARD_HEIGHT - PHOTO_BACK_HEIGHT * 2) / 3 * 2 + PHOTO_BACK_HEIGHT, PHOTO_BACK_WIDTH, PHOTO_BACK_HEIGHT, ImageDefine.SYSTEM_PHOTO_BACK),
            new SGSImageLabel(CLASS, METHOD, 0, (FRAME_HEIGHT - DASHBOARD_HEIGHT - PHOTO_BACK_HEIGHT * 2) / 3, PHOTO_BACK_WIDTH, PHOTO_BACK_HEIGHT, ImageDefine.SYSTEM_PHOTO_BACK),
            new SGSImageLabel(CLASS, METHOD, ((FRAME_WIDTH - PHOTO_BACK_WIDTH * 5) / 4 + PHOTO_BACK_WIDTH) * 1, 0, PHOTO_BACK_WIDTH, PHOTO_BACK_HEIGHT, ImageDefine.SYSTEM_PHOTO_BACK),
            new SGSImageLabel(CLASS, METHOD, ((FRAME_WIDTH - PHOTO_BACK_WIDTH * 5) / 4 + PHOTO_BACK_WIDTH) * 2, 0, PHOTO_BACK_WIDTH, PHOTO_BACK_HEIGHT, ImageDefine.SYSTEM_PHOTO_BACK),
            new SGSImageLabel(CLASS, METHOD, ((FRAME_WIDTH - PHOTO_BACK_WIDTH * 5) / 4 + PHOTO_BACK_WIDTH) * 3, 0, PHOTO_BACK_WIDTH, PHOTO_BACK_HEIGHT, ImageDefine.SYSTEM_PHOTO_BACK),
            new SGSImageLabel(CLASS, METHOD, FRAME_WIDTH - PHOTO_BACK_WIDTH, (FRAME_HEIGHT - DASHBOARD_HEIGHT - PHOTO_BACK_HEIGHT * 2) / 3, PHOTO_BACK_WIDTH, PHOTO_BACK_HEIGHT, ImageDefine.SYSTEM_PHOTO_BACK),
            new SGSImageLabel(CLASS, METHOD, FRAME_WIDTH - PHOTO_BACK_WIDTH, (FRAME_HEIGHT - DASHBOARD_HEIGHT - PHOTO_BACK_HEIGHT * 2) / 3 * 2 + PHOTO_BACK_HEIGHT, PHOTO_BACK_WIDTH, PHOTO_BACK_HEIGHT, ImageDefine.SYSTEM_PHOTO_BACK),
    };
    protected SGSImageLabel lblAvatarArray[] = {
            new SGSImageLabel(CLASS, METHOD, AVATAR_X + 0, AVATAR_Y + (FRAME_HEIGHT - DASHBOARD_HEIGHT - PHOTO_BACK_HEIGHT * 2) / 3 * 2 + PHOTO_BACK_HEIGHT, AVATAR_SIZE, AVATAR_SIZE, ImageDefine.SYSTEM_SHENCC),
            new SGSImageLabel(CLASS, METHOD, AVATAR_X + 0, AVATAR_Y + (FRAME_HEIGHT - DASHBOARD_HEIGHT - PHOTO_BACK_HEIGHT * 2) / 3, AVATAR_SIZE, AVATAR_SIZE, ImageDefine.SYSTEM_SHENCC),
            new SGSImageLabel(CLASS, METHOD, AVATAR_X + ((FRAME_WIDTH - PHOTO_BACK_WIDTH * 5) / 4 + PHOTO_BACK_WIDTH) * 1, AVATAR_Y + 0, AVATAR_SIZE, AVATAR_SIZE, ImageDefine.SYSTEM_SHENCC),
            new SGSImageLabel(CLASS, METHOD, AVATAR_X + ((FRAME_WIDTH - PHOTO_BACK_WIDTH * 5) / 4 + PHOTO_BACK_WIDTH) * 2, AVATAR_Y + 0, AVATAR_SIZE, AVATAR_SIZE, ImageDefine.SYSTEM_SHENCC),
            new SGSImageLabel(CLASS, METHOD, AVATAR_X + ((FRAME_WIDTH - PHOTO_BACK_WIDTH * 5) / 4 + PHOTO_BACK_WIDTH) * 3, AVATAR_Y + 0, AVATAR_SIZE, AVATAR_SIZE, ImageDefine.SYSTEM_SHENCC),
            new SGSImageLabel(CLASS, METHOD, AVATAR_X + FRAME_WIDTH - PHOTO_BACK_WIDTH, AVATAR_Y + (FRAME_HEIGHT - DASHBOARD_HEIGHT - PHOTO_BACK_HEIGHT * 2) / 3, AVATAR_SIZE, AVATAR_SIZE, ImageDefine.SYSTEM_SHENCC),
            new SGSImageLabel(CLASS, METHOD, AVATAR_X + FRAME_WIDTH - PHOTO_BACK_WIDTH, AVATAR_Y + (FRAME_HEIGHT - DASHBOARD_HEIGHT - PHOTO_BACK_HEIGHT * 2) / 3 * 2 + PHOTO_BACK_HEIGHT, AVATAR_SIZE, AVATAR_SIZE, ImageDefine.SYSTEM_SHENCC),
    };

    public SGSGameFrame() {
        String FROM_CLASS = CLASS;
        String FROM_METHOD = METHOD;
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        getLayeredPane().add(lblAvatar, 2);
        lblAvatar.setIconEx(CLASS, METHOD, (int) (AVATAR_SIZE * SCALE), (int) (AVATAR_SIZE * SCALE), HeroCard.getAvatar(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[0].getSelectedIndex()));
        lblAvatar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                String CLASS = "MouseEvent";
                String METHOD = "mousePressed";
                if (e.getButton() == MouseEvent.BUTTON3) {
                    SGSGameFrame_HeroCard sgsGameFrame_HeroCard = SGSGameFrame_HeroCard.getInstance();
                    sgsGameFrame_HeroCard.setBoundsEx(CLASS, METHOD, sgsGameFrame_HeroCard.getX(), sgsGameFrame_HeroCard.getY(), 420 - 70, 572 - 66);
                    SGSImageLabel lblHeroCard = new SGSImageLabel(CLASS, METHOD, -35, -33, 420, 572, HeroCard.getHeroCard(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[0].getSelectedIndex()));
                    SGSImageLabel lblHide = new SGSImageLabel(CLASS, METHOD, 0, 0, 18, 18, ImageDefine.SYSTEM_CLOSE);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHeroCard, 0);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHide, 0);
                    sgsGameFrame_HeroCard.setVisible(true);

                    lblHide.addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {
                            SGSGameFrame_HeroCard.getInstance().setVisible(false);
                        }
                    });
                }
            }
        });
        getLayeredPane().add(lblDashboardAvatar, 2);
        getLayeredPane().add(lblDashboardEquip, 2);
        getLayeredPane().add(lblDashboardHand, 3);
        getLayeredPane().add(lblPlatterBg, 2);
        getLayeredPane().add(lblConfirm, 1);
        getLayeredPane().add(lblDiscard, 1);
        getLayeredPane().add(lblCancel, 1);
        getLayeredPane().add(lblRole, 1);
        getLayeredPane().add(lblTrust, 1);

//        SGSGameFrame.index = 0;
//        for (SGSImageLabel lblAvatar : lblAvatarArray) {
//            SGSGameFrame.index++;
//            lblAvatar.setVisible(true);
//            lblAvatar.setIconEx(CLASS, METHOD, AVATAR_SIZE, AVATAR_SIZE, HeroCard.getAvatar(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[SGSGameFrame.index].getSelectedIndex()));
//            lblAvatar.addMouseListener(new MouseAdapter() {
//                public void mousePressed(MouseEvent e) {
//                    String CLASS = "MouseEvent";
//                    String METHOD = "mousePressed";
//                    if (e.getButton() == MouseEvent.BUTTON3) {
//                        SGSGameFrame_HeroCard sgsGameFrame_HeroCard = SGSGameFrame_HeroCard.getInstance();
//                        sgsGameFrame_HeroCard.setBoundsEx(CLASS, METHOD, sgsGameFrame_HeroCard.getX(), sgsGameFrame_HeroCard.getY(), 420 - 70, 572 - 66);
//                        SGSImageLabel lblHeroCard = new SGSImageLabel(CLASS, METHOD, -35, -33, 420, 572, HeroCard.getHeroCard(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[SGSGameFrame.index].getSelectedIndex()));
//                        SGSImageLabel lblHide = new SGSImageLabel(CLASS, METHOD, 0, 0, 18, 18, ImageDefine.SYSTEM_CLOSE);
//                        sgsGameFrame_HeroCard.getLayeredPane().add(lblHeroCard, 0);
//                        sgsGameFrame_HeroCard.getLayeredPane().add(lblHide, 0);
//                        sgsGameFrame_HeroCard.setVisible(true);
//
//                        lblHide.addMouseListener(new MouseAdapter() {
//                            public void mousePressed(MouseEvent e) {
//                                SGSGameFrame_HeroCard.getInstance().setVisible(false);
//                            }
//                        });
//                    }
//                }
//            });
//            getLayeredPane().add(lblAvatar, 2);
//        }

        getLayeredPane().add(lblAvatarArray[0], 2);
        lblAvatarArray[0].setVisible(true);
        lblAvatarArray[0].setIconEx(CLASS, METHOD, AVATAR_SIZE, AVATAR_SIZE, HeroCard.getAvatar(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[1].getSelectedIndex()));
        lblAvatarArray[0].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                String CLASS = "MouseEvent";
                String METHOD = "mousePressed";
                if (e.getButton() == MouseEvent.BUTTON3) {
                    SGSGameFrame_HeroCard sgsGameFrame_HeroCard = SGSGameFrame_HeroCard.getInstance();
                    sgsGameFrame_HeroCard.setBoundsEx(CLASS, METHOD, sgsGameFrame_HeroCard.getX(), sgsGameFrame_HeroCard.getY(), 420 - 70, 572 - 66);
                    SGSImageLabel lblHeroCard = new SGSImageLabel(CLASS, METHOD, -35, -33, 420, 572, HeroCard.getHeroCard(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[1].getSelectedIndex()));
                    SGSImageLabel lblHide = new SGSImageLabel(CLASS, METHOD, 0, 0, 18, 18, ImageDefine.SYSTEM_CLOSE);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHeroCard, 0);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHide, 0);
                    sgsGameFrame_HeroCard.setVisible(true);

                    lblHide.addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {
                            SGSGameFrame_HeroCard.getInstance().setVisible(false);
                        }
                    });
                }
            }
        });

        getLayeredPane().add(lblAvatarArray[1], 2);
        lblAvatarArray[1].setVisible(true);
        lblAvatarArray[1].setIconEx(CLASS, METHOD, AVATAR_SIZE, AVATAR_SIZE, HeroCard.getAvatar(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[2].getSelectedIndex()));
        lblAvatarArray[1].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                String CLASS = "MouseEvent";
                String METHOD = "mousePressed";
                if (e.getButton() == MouseEvent.BUTTON3) {
                    SGSGameFrame_HeroCard sgsGameFrame_HeroCard = SGSGameFrame_HeroCard.getInstance();
                    sgsGameFrame_HeroCard.setBoundsEx(CLASS, METHOD, sgsGameFrame_HeroCard.getX(), sgsGameFrame_HeroCard.getY(), 420 - 70, 572 - 66);
                    SGSImageLabel lblHeroCard = new SGSImageLabel(CLASS, METHOD, -35, -33, 420, 572, HeroCard.getHeroCard(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[2].getSelectedIndex()));
                    SGSImageLabel lblHide = new SGSImageLabel(CLASS, METHOD, 0, 0, 18, 18, ImageDefine.SYSTEM_CLOSE);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHeroCard, 0);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHide, 0);
                    sgsGameFrame_HeroCard.setVisible(true);

                    lblHide.addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {
                            SGSGameFrame_HeroCard.getInstance().setVisible(false);
                        }
                    });
                }
            }
        });

        getLayeredPane().add(lblAvatarArray[2], 2);
        lblAvatarArray[2].setVisible(true);
        lblAvatarArray[2].setIconEx(CLASS, METHOD, AVATAR_SIZE, AVATAR_SIZE, HeroCard.getAvatar(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[3].getSelectedIndex()));
        lblAvatarArray[2].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                String CLASS = "MouseEvent";
                String METHOD = "mousePressed";
                if (e.getButton() == MouseEvent.BUTTON3) {
                    SGSGameFrame_HeroCard sgsGameFrame_HeroCard = SGSGameFrame_HeroCard.getInstance();
                    sgsGameFrame_HeroCard.setBoundsEx(CLASS, METHOD, sgsGameFrame_HeroCard.getX(), sgsGameFrame_HeroCard.getY(), 420 - 70, 572 - 66);
                    SGSImageLabel lblHeroCard = new SGSImageLabel(CLASS, METHOD, -35, -33, 420, 572, HeroCard.getHeroCard(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[3].getSelectedIndex()));
                    SGSImageLabel lblHide = new SGSImageLabel(CLASS, METHOD, 0, 0, 18, 18, ImageDefine.SYSTEM_CLOSE);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHeroCard, 0);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHide, 0);
                    sgsGameFrame_HeroCard.setVisible(true);

                    lblHide.addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {
                            SGSGameFrame_HeroCard.getInstance().setVisible(false);
                        }
                    });
                }
            }
        });

        getLayeredPane().add(lblAvatarArray[3], 2);
        lblAvatarArray[3].setVisible(true);
        lblAvatarArray[3].setIconEx(CLASS, METHOD, AVATAR_SIZE, AVATAR_SIZE, HeroCard.getAvatar(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[4].getSelectedIndex()));
        lblAvatarArray[3].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                String CLASS = "MouseEvent";
                String METHOD = "mousePressed";
                if (e.getButton() == MouseEvent.BUTTON3) {
                    SGSGameFrame_HeroCard sgsGameFrame_HeroCard = SGSGameFrame_HeroCard.getInstance();
                    sgsGameFrame_HeroCard.setBoundsEx(CLASS, METHOD, sgsGameFrame_HeroCard.getX(), sgsGameFrame_HeroCard.getY(), 420 - 70, 572 - 66);
                    SGSImageLabel lblHeroCard = new SGSImageLabel(CLASS, METHOD, -35, -33, 420, 572, HeroCard.getHeroCard(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[4].getSelectedIndex()));
                    SGSImageLabel lblHide = new SGSImageLabel(CLASS, METHOD, 0, 0, 18, 18, ImageDefine.SYSTEM_CLOSE);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHeroCard, 0);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHide, 0);
                    sgsGameFrame_HeroCard.setVisible(true);

                    lblHide.addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {
                            SGSGameFrame_HeroCard.getInstance().setVisible(false);
                        }
                    });
                }
            }
        });

        getLayeredPane().add(lblAvatarArray[4], 2);
        lblAvatarArray[4].setVisible(true);
        lblAvatarArray[4].setIconEx(CLASS, METHOD, AVATAR_SIZE, AVATAR_SIZE, HeroCard.getAvatar(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[5].getSelectedIndex()));
        lblAvatarArray[4].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                String CLASS = "MouseEvent";
                String METHOD = "mousePressed";
                if (e.getButton() == MouseEvent.BUTTON3) {
                    SGSGameFrame_HeroCard sgsGameFrame_HeroCard = SGSGameFrame_HeroCard.getInstance();
                    sgsGameFrame_HeroCard.setBoundsEx(CLASS, METHOD, sgsGameFrame_HeroCard.getX(), sgsGameFrame_HeroCard.getY(), 420 - 70, 572 - 66);
                    SGSImageLabel lblHeroCard = new SGSImageLabel(CLASS, METHOD, -35, -33, 420, 572, HeroCard.getHeroCard(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[5].getSelectedIndex()));
                    SGSImageLabel lblHide = new SGSImageLabel(CLASS, METHOD, 0, 0, 18, 18, ImageDefine.SYSTEM_CLOSE);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHeroCard, 0);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHide, 0);
                    sgsGameFrame_HeroCard.setVisible(true);

                    lblHide.addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {
                            SGSGameFrame_HeroCard.getInstance().setVisible(false);
                        }
                    });
                }
            }
        });

        getLayeredPane().add(lblAvatarArray[5], 2);
        lblAvatarArray[5].setVisible(true);
        lblAvatarArray[5].setIconEx(CLASS, METHOD, AVATAR_SIZE, AVATAR_SIZE, HeroCard.getAvatar(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[6].getSelectedIndex()));
        lblAvatarArray[5].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                String CLASS = "MouseEvent";
                String METHOD = "mousePressed";
                if (e.getButton() == MouseEvent.BUTTON3) {
                    SGSGameFrame_HeroCard sgsGameFrame_HeroCard = SGSGameFrame_HeroCard.getInstance();
                    sgsGameFrame_HeroCard.setBoundsEx(CLASS, METHOD, sgsGameFrame_HeroCard.getX(), sgsGameFrame_HeroCard.getY(), 420 - 70, 572 - 66);
                    SGSImageLabel lblHeroCard = new SGSImageLabel(CLASS, METHOD, -35, -33, 420, 572, HeroCard.getHeroCard(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[6].getSelectedIndex()));
                    SGSImageLabel lblHide = new SGSImageLabel(CLASS, METHOD, 0, 0, 18, 18, ImageDefine.SYSTEM_CLOSE);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHeroCard, 0);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHide, 0);
                    sgsGameFrame_HeroCard.setVisible(true);

                    lblHide.addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {
                            SGSGameFrame_HeroCard.getInstance().setVisible(false);
                        }
                    });
                }
            }
        });

        getLayeredPane().add(lblAvatarArray[6], 2);
        lblAvatarArray[6].setVisible(true);
        lblAvatarArray[6].setIconEx(CLASS, METHOD, AVATAR_SIZE, AVATAR_SIZE, HeroCard.getAvatar(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[7].getSelectedIndex()));
        lblAvatarArray[6].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                String CLASS = "MouseEvent";
                String METHOD = "mousePressed";
                if (e.getButton() == MouseEvent.BUTTON3) {
                    SGSGameFrame_HeroCard sgsGameFrame_HeroCard = SGSGameFrame_HeroCard.getInstance();
                    sgsGameFrame_HeroCard.setBoundsEx(CLASS, METHOD, sgsGameFrame_HeroCard.getX(), sgsGameFrame_HeroCard.getY(), 420 - 70, 572 - 66);
                    SGSImageLabel lblHeroCard = new SGSImageLabel(CLASS, METHOD, -35, -33, 420, 572, HeroCard.getHeroCard(CLASS, METHOD, sgsBeforeGameFrame.cmbHeroCard[7].getSelectedIndex()));
                    SGSImageLabel lblHide = new SGSImageLabel(CLASS, METHOD, 0, 0, 18, 18, ImageDefine.SYSTEM_CLOSE);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHeroCard, 0);
                    sgsGameFrame_HeroCard.getLayeredPane().add(lblHide, 0);
                    sgsGameFrame_HeroCard.setVisible(true);

                    lblHide.addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {
                            SGSGameFrame_HeroCard.getInstance().setVisible(false);
                        }
                    });
                }
            }
        });

        for (SGSImageLabel lblPhotoBack : lblPhotoBackArray) {
            getLayeredPane().add(lblPhotoBack, 1);
            // lblPhotoBack.setVisible(false); // Debug
        }
        // lblPhotoBackArray[3].setVisible(true); // Debug

//        SGSImageLabel lblHandCardArray[] = {
//                new SGSImageLabel(CLASS, METHOD, 0, 0, 200 / 2, 290 / 2, ImageDefine.BIG_CARD_AMAZING_GRACE),
//                new SGSImageLabel(CLASS, METHOD, 0, 0, 200 / 2, 290 / 2, ImageDefine.BIG_CARD_AMAZING_GRACE),
//                new SGSImageLabel(CLASS, METHOD, 0, 0, 200 / 2, 290 / 2, ImageDefine.BIG_CARD_AMAZING_GRACE),
//                new SGSImageLabel(CLASS, METHOD, 0, 0, 200 / 2, 290 / 2, ImageDefine.BIG_CARD_AMAZING_GRACE),
//        };
//        for (SGSImageLabel lblHandCard : lblHandCardArray) {
//            getLayeredPane().add(lblHandCard, 0);
//        }

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    @Override
    public void displayFrame(String FROM_CLASS, String FROM_METHOD) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);
        setBoundsEx(CLASS, METHOD, sgsBeforeGameFrame.getX(), sgsBeforeGameFrame.getY(), sgsBeforeGameFrame.getWidth(), sgsBeforeGameFrame.getHeight());
        setVisibleEx(CLASS, METHOD, true);
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }
}
