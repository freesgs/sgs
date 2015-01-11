package game;

import audio.AudioDefine;
import image.ImageDefine;

/**
 * Created by Free on 2015/01/10.
 */
public enum HandCard {
    SLASH(1, "杀", ImageDefine.BIG_CARD_SLASH, AudioDefine.CARD_FEMALE_SLASH, AudioDefine.CARD_MALE_SLASH),
    JINK(2, "闪", ImageDefine.BIG_CARD_JINK, AudioDefine.CARD_FEMALE_JINK, AudioDefine.CARD_MALE_JINK),
    PEACH(3, "桃", ImageDefine.BIG_CARD_PEACH, AudioDefine.CARD_FEMALE_PEACH, AudioDefine.CARD_MALE_PEACH),

    ANALEPTIC(4, "酒", ImageDefine.BIG_CARD_ANALEPTIC, AudioDefine.CARD_FEMALE_ANALEPTIC, AudioDefine.CARD_MALE_ANALEPTIC),
    FIRE_SLASH(5, "火杀", ImageDefine.BIG_CARD_FIRE_SLASH, AudioDefine.CARD_FEMALE_FIRE_SLASH, AudioDefine.CARD_MALE_FIRE_SLASH),
    THUNDER_SLASH(6, "雷杀", ImageDefine.BIG_CARD_THUNDER_SLASH, AudioDefine.CARD_FEMALE_THUNDER_SLASH, AudioDefine.CARD_MALE_THUNDER_SLASH),

    AMAZING_GRACE(7, "五谷丰登", ImageDefine.BIG_CARD_AMAZING_GRACE, AudioDefine.CARD_FEMALE_AMAZING_GRACE, AudioDefine.CARD_MALE_AMAZING_GRACE),
    ARCHERY_ATTACK(8, "万箭齐发", ImageDefine.BIG_CARD_ARCHERY_ATTACK, AudioDefine.CARD_FEMALE_ARCHERY_ATTACK, AudioDefine.CARD_MALE_ARCHERY_ATTACK),
    COLLATERAL(9, "借刀杀人", ImageDefine.BIG_CARD_COLLATERAL, AudioDefine.CARD_FEMALE_COLLATERAL, AudioDefine.CARD_MALE_COLLATERAL),
    DISMANTLEMENT(10, "过河拆桥", ImageDefine.BIG_CARD_DISMANTLEMENT, AudioDefine.CARD_FEMALE_DISMANTLEMENT, AudioDefine.CARD_MALE_DISMANTLEMENT),
    DUEL(11, "决斗", ImageDefine.BIG_CARD_DUEL, AudioDefine.CARD_FEMALE_DUEL, AudioDefine.CARD_MALE_DUEL),
    EX_NIHILO(12, "无中生有", ImageDefine.BIG_CARD_EX_NIHILO, AudioDefine.CARD_FEMALE_EX_NIHILO, AudioDefine.CARD_MALE_EX_NIHILO),
    FIRE_ATTACK(13, "火攻", ImageDefine.BIG_CARD_FIRE_ATTACK, AudioDefine.CARD_FEMALE_FIRE_ATTACK, AudioDefine.CARD_MALE_FIRE_ATTACK),
    GOD_SALVATION(14, "桃园结义", ImageDefine.BIG_CARD_GOD_SALVATION, AudioDefine.CARD_FEMALE_GOD_SALVATION, AudioDefine.CARD_MALE_GOD_SALVATION),
    INDULGENCE(15, "乐不思蜀", ImageDefine.BIG_CARD_INDULGENCE, AudioDefine.CARD_FEMALE_INDULGENCE, AudioDefine.CARD_MALE_INDULGENCE),
    IRON_CHAIN(16, "铁索连环", ImageDefine.BIG_CARD_IRON_CHAIN, AudioDefine.CARD_FEMALE_IRON_CHAIN, AudioDefine.CARD_MALE_IRON_CHAIN),
    LIGHTNING(17, "闪电", ImageDefine.BIG_CARD_LIGHTNING, AudioDefine.CARD_FEMALE_LIGHTNING, AudioDefine.CARD_MALE_LIGHTNING),
    NULLIFICATION(18, "无懈可击", ImageDefine.BIG_CARD_NULLIFICATION, AudioDefine.CARD_FEMALE_NULLIFICATION, AudioDefine.CARD_MALE_NULLIFICATION),
    SAVAGE_ASSAULT(19, "南蛮入侵", ImageDefine.BIG_CARD_SAVAGE_ASSAULT, AudioDefine.CARD_FEMALE_SAVAGE_ASSAULT, AudioDefine.CARD_MALE_SAVAGE_ASSAULT),
    SNATCH(20, "顺手牵羊", ImageDefine.BIG_CARD_SNATCH, AudioDefine.CARD_FEMALE_SNATCH, AudioDefine.CARD_MALE_SNATCH),
    SUPPLY_SHORTAGE(21, "兵粮寸断", ImageDefine.BIG_CARD_SUPPLY_SHORTAGE, AudioDefine.CARD_FEMALE_SUPPLY_SHORTAGE, AudioDefine.CARD_MALE_SUPPLY_SHORTAGE),

    AXE(22, "贯石斧", ImageDefine.BIG_CARD_AXE, AudioDefine.CARD_COMMON_WEAPON, AudioDefine.CARD_COMMON_WEAPON),
    BLADE(23, "青龙偃月刀", ImageDefine.BIG_CARD_BLADE, AudioDefine.CARD_COMMON_WEAPON, AudioDefine.CARD_COMMON_WEAPON),
    CROSSBOW(24, "诸葛连弩", ImageDefine.BIG_CARD_CROSSBOW, AudioDefine.CARD_COMMON_WEAPON, AudioDefine.CARD_COMMON_WEAPON),
    DOUBLESWORD(25, "雌雄双股剑", ImageDefine.BIG_CARD_DOUBLESWORD, AudioDefine.CARD_COMMON_WEAPON, AudioDefine.CARD_COMMON_WEAPON),
    FAN(27, "朱雀羽扇", ImageDefine.BIG_CARD_FAN, AudioDefine.CARD_COMMON_WEAPON, AudioDefine.CARD_COMMON_WEAPON),
    GUDINGBLADE(28, "古锭刀", ImageDefine.BIG_CARD_GUDINGBLADE, AudioDefine.CARD_COMMON_WEAPON, AudioDefine.CARD_COMMON_WEAPON),
    HALBERD(29, "方天画戟", ImageDefine.BIG_CARD_HALBERD, AudioDefine.CARD_COMMON_WEAPON, AudioDefine.CARD_COMMON_WEAPON),
    ICESWORD(30, "寒冰剑", ImageDefine.BIG_CARD_ICESWORD, AudioDefine.CARD_COMMON_WEAPON, AudioDefine.CARD_COMMON_WEAPON),
    KYLINBOW(31, "麒麟弓", ImageDefine.BIG_CARD_KYLINBOW, AudioDefine.CARD_COMMON_WEAPON, AudioDefine.CARD_COMMON_WEAPON),
    QINGGANGSWORD(32, "青釭剑", ImageDefine.BIG_CARD_QINGGANGSWORD, AudioDefine.CARD_COMMON_WEAPON, AudioDefine.CARD_COMMON_WEAPON),
    SPEAR(35, "丈八蛇矛", ImageDefine.BIG_CARD_SPEAR, AudioDefine.CARD_COMMON_WEAPON, AudioDefine.CARD_COMMON_WEAPON),

    EIGHTDIAGRAM(26, "八卦阵", ImageDefine.BIG_CARD_EIGHTDIAGRAM, AudioDefine.CARD_COMMON_ARMOR, AudioDefine.CARD_COMMON_ARMOR),
    RENWANGSHIELD(33, "仁王盾", ImageDefine.BIG_CARD_RENWANGSHIELD, AudioDefine.CARD_COMMON_ARMOR, AudioDefine.CARD_COMMON_ARMOR),
    SILVERLION(34, "白银狮子", ImageDefine.BIG_CARD_SILVERLION, AudioDefine.CARD_COMMON_ARMOR, AudioDefine.CARD_COMMON_ARMOR),
    VINE(36, "藤甲", ImageDefine.BIG_CARD_VINE, AudioDefine.CARD_COMMON_ARMOR, AudioDefine.CARD_COMMON_ARMOR),

    DILU(37, "的卢", ImageDefine.BIG_CARD_DILU, AudioDefine.CARD_COMMON_HORSE, AudioDefine.CARD_COMMON_HORSE),
    HUALIU(38, "骅骝", ImageDefine.BIG_CARD_HUALIU, AudioDefine.CARD_COMMON_HORSE, AudioDefine.CARD_COMMON_HORSE),
    JUEYING(39, "绝影", ImageDefine.BIG_CARD_JUEYING, AudioDefine.CARD_COMMON_HORSE, AudioDefine.CARD_COMMON_HORSE),
    ZHUAHUANGFEIDIAN(40, "爪黄飞电", ImageDefine.BIG_CARD_ZHUAHUANGFEIDIAN, AudioDefine.CARD_COMMON_HORSE, AudioDefine.CARD_COMMON_HORSE),

    CHITU(41, "赤兔", ImageDefine.BIG_CARD_CHITU, AudioDefine.CARD_COMMON_HORSE, AudioDefine.CARD_COMMON_HORSE),
    DAYUAN(42, "大宛", ImageDefine.BIG_CARD_DAYUAN, AudioDefine.CARD_COMMON_HORSE, AudioDefine.CARD_COMMON_HORSE),
    ZIXING(43, "紫骍", ImageDefine.BIG_CARD_ZIXING, AudioDefine.CARD_COMMON_HORSE, AudioDefine.CARD_COMMON_HORSE),;

    public final int index;
    public final String text;
    public final String imageHandCard;
    public final String audioFemale;
    public final String audioMale;

    private HandCard(int index, String text, String imageHandCard, String audioFemale, String audioMale) {
        this.index = index;
        this.text = text;
        this.imageHandCard = imageHandCard;
        this.audioFemale = audioFemale;
        this.audioMale = audioMale;
    }
}
