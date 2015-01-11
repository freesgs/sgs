package game;

import image.ImageDefine;
import log.Log;

/**
 * Created by Free on 2014/12/30.
 */
public enum HeroCard {
    RANDOM(0, "随机", Sex.female, Kingdom.RANDOM, ImageDefine.HEROCARD_BACK01, ImageDefine.HEROCARD_BACK01),
    CAOCAO(1, "曹操", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_BASIC_WEI001CAOCAO_JPG, ImageDefine.HEROCARD_BASIC_WEI001CAOCAO_PNG),
    SIMAYI(2, "司马懿", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_BASIC_WEI002SIMAYI_JPG, ImageDefine.HEROCARD_BASIC_WEI002SIMAYI_PNG),
    XIAHOUDUN(3, "夏侯惇", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_BASIC_WEI003XIAHOUDUN_JPG, ImageDefine.HEROCARD_BASIC_WEI003XIAHOUDUN_PNG),
    ZHANGLIAO(4, "张辽", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_BASIC_WEI004ZHANGLIAO_JPG, ImageDefine.HEROCARD_BASIC_WEI004ZHANGLIAO_PNG),
    XUCHU(5, "许褚", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_BASIC_WEI005XUCHU_JPG, ImageDefine.HEROCARD_BASIC_WEI005XUCHU_PNG),
    GUOJIA(6, "郭嘉", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_BASIC_WEI006GUOJIA_JPG, ImageDefine.HEROCARD_BASIC_WEI006GUOJIA_PNG),
    ZHENJI(7, "甄姬", Sex.female, Kingdom.WEI, ImageDefine.HEROCARD_BASIC_WEI007ZHENJI_JPG, ImageDefine.HEROCARD_BASIC_WEI007ZHENJI_PNG),
    LIUBEI(8, "刘备", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_BASIC_SHU001LIUBEI_JPG, ImageDefine.HEROCARD_BASIC_SHU001LIUBEI_PNG),
    GUANYU(9, "关羽", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_BASIC_SHU002GUANYU_JPG, ImageDefine.HEROCARD_BASIC_SHU002GUANYU_PNG),
    ZHANGFEI(10, "张飞", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_BASIC_SHU003ZHANGFEI_JPG, ImageDefine.HEROCARD_BASIC_SHU003ZHANGFEI_PNG),
    ZHUGELIANG(11, "诸葛亮", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_BASIC_SHU004ZHUGELIANG_JPG, ImageDefine.HEROCARD_BASIC_SHU004ZHUGELIANG_PNG),
    ZHAOYUN(12, "赵云", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_BASIC_SHU005ZHAOYUN_JPG, ImageDefine.HEROCARD_BASIC_SHU005ZHAOYUN_PNG),
    MACHAO(13, "马超", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_BASIC_SHU006MACHAO_JPG, ImageDefine.HEROCARD_BASIC_SHU006MACHAO_PNG),
    HUANGYUEYING(14, "黄月英", Sex.female, Kingdom.SHU, ImageDefine.HEROCARD_BASIC_SHU007HUANGYUEYING_JPG, ImageDefine.HEROCARD_BASIC_SHU007HUANGYUEYING_PNG),
    SUNQUAN(15, "孙权", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_BASIC_WU001SUNQUAN_JPG, ImageDefine.HEROCARD_BASIC_WU001SUNQUAN_PNG),
    GANNING(16, "甘宁", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_BASIC_WU002GANNING_JPG, ImageDefine.HEROCARD_BASIC_WU002GANNING_PNG),
    LVMENG(17, "吕蒙", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_BASIC_WU003LVMENG_JPG, ImageDefine.HEROCARD_BASIC_WU003LVMENG_PNG),
    HUANGGAI(18, "黄盖", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_BASIC_WU004HUANGGAI_JPG, ImageDefine.HEROCARD_BASIC_WU004HUANGGAI_PNG),
    ZHOUYU(19, "周瑜", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_BASIC_WU005ZHOUYU_JPG, ImageDefine.HEROCARD_BASIC_WU005ZHOUYU_PNG),
    DAQIAO(20, "大乔", Sex.female, Kingdom.WU, ImageDefine.HEROCARD_BASIC_WU006DAQIAO_JPG, ImageDefine.HEROCARD_BASIC_WU006DAQIAO_PNG),
    LUXUN(21, "陆逊", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_BASIC_WU007LUXUN_JPG, ImageDefine.HEROCARD_BASIC_WU007LUXUN_PNG),
    SUNSHANGXIANG(22, "孙尚香", Sex.female, Kingdom.WU, ImageDefine.HEROCARD_BASIC_WU008SUNSHANGXIANG_JPG, ImageDefine.HEROCARD_BASIC_WU008SUNSHANGXIANG_PNG),
    HUATUO(23, "华佗", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_BASIC_QUN001HUATUO_JPG, ImageDefine.HEROCARD_BASIC_QUN001HUATUO_PNG),
    LVBU(24, "吕布", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_BASIC_QUN002LVBU_JPG, ImageDefine.HEROCARD_BASIC_QUN002LVBU_PNG),
    DIAOCHAN(25, "貂蝉", Sex.female, Kingdom.QUN, ImageDefine.HEROCARD_BASIC_QUN003DIAOCHAN_JPG, ImageDefine.HEROCARD_BASIC_QUN003DIAOCHAN_PNG),
    SHENGUANYU(26, "神关羽", Sex.male, Kingdom.RANDOM, ImageDefine.HEROCARD_WIND_LE001GUANYU_JPG, ImageDefine.HEROCARD_WIND_LE001GUANYU_PNG),
    SHENLVMENG(27, "神吕蒙", Sex.male, Kingdom.RANDOM, ImageDefine.HEROCARD_WIND_LE002LVMENG_JPG, ImageDefine.HEROCARD_WIND_LE002LVMENG_PNG),
    ZHANGJIAO(28, "张角", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_WIND_QUN010ZHANGJIAO_JPG, ImageDefine.HEROCARD_WIND_QUN010ZHANGJIAO_PNG),
    YUJI(29, "于吉", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_WIND_QUN011YUJI_JPG, ImageDefine.HEROCARD_WIND_QUN011YUJI_PNG),
    HUANGZHONG(30, "黄忠", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_WIND_SHU008HUANGZHONG_JPG, ImageDefine.HEROCARD_WIND_SHU008HUANGZHONG_PNG),
    WEIYAN(31, "魏延", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_WIND_SHU009WEIYAN_JPG, ImageDefine.HEROCARD_WIND_SHU009WEIYAN_PNG),
    XIAHOUYUAN(32, "夏侯渊", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_WIND_WEI008XIAHOUYUAN_JPG, ImageDefine.HEROCARD_WIND_WEI008XIAHOUYUAN_PNG),
    CAOREN(33, "曹仁", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_WIND_WEI011CAOREN_JPG, ImageDefine.HEROCARD_WIND_WEI011CAOREN_PNG),
    XIAOQIAO(34, "小乔", Sex.female, Kingdom.WU, ImageDefine.HEROCARD_WIND_WU011XIAOQIAO_JPG, ImageDefine.HEROCARD_WIND_WU011XIAOQIAO_PNG),
    ZHOUTAI(35, "周泰", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_WIND_WU013ZHOUTAI_JPG, ImageDefine.HEROCARD_WIND_WU013ZHOUTAI_PNG),
    SHENZHOUYU(36, "神周瑜", Sex.male, Kingdom.RANDOM, ImageDefine.HEROCARD_FIRE_LE003ZHOUYU_JPG, ImageDefine.HEROCARD_FIRE_LE003ZHOUYU_PNG),
    SHENZHUGELIANG(37, "神诸葛亮", Sex.male, Kingdom.RANDOM, ImageDefine.HEROCARD_FIRE_LE004ZHUGELIANG_JPG, ImageDefine.HEROCARD_FIRE_LE004ZHUGELIANG_PNG),
    YUANSHAO(38, "袁绍", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_FIRE_QUN004YUANSHAO_JPG, ImageDefine.HEROCARD_FIRE_QUN004YUANSHAO_PNG),
    YANLIANG(39, "颜良", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_FIRE_QUN005YANLIANG_JPG, ImageDefine.HEROCARD_FIRE_QUN005YANLIANG_PNG),
    PANGDE(40, "庞德", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_FIRE_QUN008PANGDE_JPG, ImageDefine.HEROCARD_FIRE_QUN008PANGDE_PNG),
    PANGTONG(41, "庞统", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_FIRE_SHU010PANGTONG_JPG, ImageDefine.HEROCARD_FIRE_SHU010PANGTONG_PNG),
    FIREZHUGELIANG(42, "火诸葛亮", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_FIRE_SHU011ZHUGELIANG_JPG, ImageDefine.HEROCARD_FIRE_SHU011ZHUGELIANG_PNG),
    DIANWEI(43, "典韦", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_FIRE_WEI012DIANWEI_JPG, ImageDefine.HEROCARD_FIRE_WEI012DIANWEI_PNG),
    XUNYU(44, "荀彧", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_FIRE_WEI013XUNYU_JPG, ImageDefine.HEROCARD_FIRE_WEI013XUNYU_PNG),
    TAISHICI(45, "太史慈", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_FIRE_WU012TAISHICI_JPG, ImageDefine.HEROCARD_FIRE_WU012TAISHICI_PNG),
    SHENCAOCAO(46, "神曹操", Sex.male, Kingdom.RANDOM, ImageDefine.HEROCARD_WOOD_LE005CAOCAO_JPG, ImageDefine.HEROCARD_WOOD_LE005CAOCAO_PNG),
    SHENLVBU(47, "神吕布", Sex.male, Kingdom.RANDOM, ImageDefine.HEROCARD_WOOD_LE006LVBU_JPG, ImageDefine.HEROCARD_WOOD_LE006LVBU_PNG),
    DONGZHUO(48, "董卓", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_WOOD_QUN006DONGZHUO_JPG, ImageDefine.HEROCARD_WOOD_QUN006DONGZHUO_PNG),
    JIAXU(49, "贾诩", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_WOOD_QUN007JIAXU_JPG, ImageDefine.HEROCARD_WOOD_QUN007JIAXU_PNG),
    MENGHUO(50, "孟获", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_WOOD_SHU014MENGHUO_JPG, ImageDefine.HEROCARD_WOOD_SHU014MENGHUO_PNG),
    ZHURONG(51, "祝融", Sex.female, Kingdom.SHU, ImageDefine.HEROCARD_WOOD_SHU015ZHURONG_JPG, ImageDefine.HEROCARD_WOOD_SHU015ZHURONG_PNG),
    XUHUANG(52, "徐晃", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_WOOD_WEI010XUHUANG_JPG, ImageDefine.HEROCARD_WOOD_WEI010XUHUANG_PNG),
    CAOPI(53, "曹丕", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_WOOD_WEI014CAOPI_JPG, ImageDefine.HEROCARD_WOOD_WEI014CAOPI_PNG),
    SUNJIAN(54, "孙坚", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_WOOD_WU009SUNJIAN_JPG, ImageDefine.HEROCARD_WOOD_WU009SUNJIAN_PNG),
    LUSU(55, "鲁肃", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_WOOD_WU014LUSU_JPG, ImageDefine.HEROCARD_WOOD_WU014LUSU_PNG),
    SHENZHAOYUN(56, "神赵云", Sex.male, Kingdom.RANDOM, ImageDefine.HEROCARD_HILL_LE007ZHAOYUN_JPG, ImageDefine.HEROCARD_HILL_LE007ZHAOYUN_PNG),
    SHENSIMAYI(57, "神司马懿", Sex.male, Kingdom.RANDOM, ImageDefine.HEROCARD_HILL_LE008SIMAYI_JPG, ImageDefine.HEROCARD_HILL_LE008SIMAYI_PNG),
    ZUOCI(58, "左慈", Sex.male, Kingdom.RANDOM, ImageDefine.HEROCARD_HILL_QUN009ZUOCI_JPG, ImageDefine.HEROCARD_HILL_QUN009ZUOCI_PNG),
    CAIWENJI(59, "蔡文姬", Sex.female, Kingdom.QUN, ImageDefine.HEROCARD_HILL_QUN012CAIWENJI_JPG, ImageDefine.HEROCARD_HILL_QUN012CAIWENJI_PNG),
    JIANGWWEI(60, "姜维", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_HILL_SHU012JIANGWWEI_JPG, ImageDefine.HEROCARD_HILL_SHU012JIANGWWEI_PNG),
    LIUSHAN(61, "刘禅", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_HILL_SHU013LIUSHAN_JPG, ImageDefine.HEROCARD_HILL_SHU013LIUSHAN_PNG),
    ZHANGHE(62, "张郃", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_HILL_WEI009ZHANGHE_JPG, ImageDefine.HEROCARD_HILL_WEI009ZHANGHE_PNG),
    DENGAI(63, "邓艾", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_HILL_WEI015DENGAI_JPG, ImageDefine.HEROCARD_HILL_WEI015DENGAI_PNG),
    SUNCE(64, "孙策", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_HILL_WU010SUNCE_JPG, ImageDefine.HEROCARD_HILL_WU010SUNCE_PNG),
    ZHANGZHAOZHANGHONG(65, "张昭张纮", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_HILL_WU015ZHANGZHAOZHANGHONG_JPG, ImageDefine.HEROCARD_HILL_WU015ZHANGZHAOZHANGHONG_PNG),
    YANGXIU(66, "杨修", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_SP1_SP001YANGXIU_JPG, ImageDefine.HEROCARD_SP1_SP001YANGXIU_PNG),
    SPDIAOCHAN(67, "SP貂蝉", Sex.female, Kingdom.QUN, ImageDefine.HEROCARD_SP1_SP002DIAOCHAN_JPG, ImageDefine.HEROCARD_SP1_SP002DIAOCHAN_PNG),
    GONGSUNZAN(68, "公孙瓒", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_SP1_SP003GONGSUNZAN_JPG, ImageDefine.HEROCARD_SP1_SP003GONGSUNZAN_PNG),
    YUANSHU(69, "袁术", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_SP1_SP004YUANSHU_JPG, ImageDefine.HEROCARD_SP1_SP004YUANSHU_PNG),
    SPSUNSHANGXIANG(70, "SP孙尚香", Sex.female, Kingdom.SHU, ImageDefine.HEROCARD_SP1_SP005SUNSHANGXIANG_JPG, ImageDefine.HEROCARD_SP1_SP005SUNSHANGXIANG_PNG),
    SPPANGDE(71, "SP庞德", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_SP1_SP006PANGDE_JPG, ImageDefine.HEROCARD_SP1_SP006PANGDE_PNG),
    SPGUANYU(72, "SP关羽", Sex.male, Kingdom.RANDOM, ImageDefine.HEROCARD_SP1_SP007GUANYU_JPG, ImageDefine.HEROCARD_SP1_SP007GUANYU_PNG),
    SPLVBU(73, "SP吕布", Sex.male, Kingdom.RANDOM, ImageDefine.HEROCARD_SP1_SP008LVBU_JPG, ImageDefine.HEROCARD_SP1_SP008LVBU_PNG),
    SPLVBUNU(74, "SP吕布", Sex.male, Kingdom.RANDOM, ImageDefine.HEROCARD_SP1_SP008LVBU02_JPG, ImageDefine.HEROCARD_SP1_SP008LVBU02_PNG),
    SPCAIWENJI(75, "SP蔡文姬", Sex.female, Kingdom.WEI, ImageDefine.HEROCARD_SP1_SP009CAIWENJI_JPG, ImageDefine.HEROCARD_SP1_SP009CAIWENJI_PNG),
    SPMACHAO(76, "SP马超", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_SP1_SP011MACHAO_JPG, ImageDefine.HEROCARD_SP1_SP011MACHAO_PNG),
    SPJIAXU(77, "SP贾诩", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_SP1_SP012JIAXU_JPG, ImageDefine.HEROCARD_SP1_SP012JIAXU_PNG),
    CAOHONG(78, "曹洪", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_SP1_SP013CAOHONG_JPG, ImageDefine.HEROCARD_SP1_SP013CAOHONG_PNG),
    GUANYINPING(79, "关银萍", Sex.female, Kingdom.SHU, ImageDefine.HEROCARD_SP1_SP014GUANYINPING_JPG, ImageDefine.HEROCARD_SP1_SP014GUANYINPING_PNG),
    SPZHENJI(80, "SP甄姬", Sex.female, Kingdom.WEI, ImageDefine.HEROCARD_SP1_SP015ZHENJI_JPG, ImageDefine.HEROCARD_SP1_SP015ZHENJI_PNG),
    SPLIUXIE(81, "SP刘备", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_SP1_SP016LIUXIE_JPG, ImageDefine.HEROCARD_SP1_SP016LIUXIE_PNG),
    LINGJIU(82, "灵雎", Sex.female, Kingdom.QUN, ImageDefine.HEROCARD_SP1_SP017LINGJIU_JPG, ImageDefine.HEROCARD_SP1_SP017LINGJIU_PNG),
    FUWAN(83, "伏完", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_SP1_SP018FUWAN_JPG, ImageDefine.HEROCARD_SP1_SP018FUWAN_PNG),
    XIAHOUBA(84, "夏侯霸", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_SP1_SP019XIAHOUBA_JPG, ImageDefine.HEROCARD_SP1_SP019XIAHOUBA_PNG),
    CHENLIN(85, "陈琳", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_SP1_SP020CHENLIN_JPG, ImageDefine.HEROCARD_SP1_SP020CHENLIN_PNG),
    DAQIAOXIAOQIAO(86, "大乔小乔", Sex.female, Kingdom.WU, ImageDefine.HEROCARD_SP1_SP021DAQIAOXIAOQIAO_JPG, ImageDefine.HEROCARD_SP1_SP021DAQIAOXIAOQIAO_PNG),
    SPZHAOYUN(87, "SP赵云", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_SP2_SP001ZHAOYUN_JPG, ImageDefine.HEROCARD_SP2_SP001ZHAOYUN_PNG),
    SP2DIAOCHAN(88, "SP貂蝉", Sex.female, Kingdom.QUN, ImageDefine.HEROCARD_SP2_SP002DIAOCHAN_JPG, ImageDefine.HEROCARD_SP2_SP002DIAOCHAN_PNG),
    SP2CAOREN(89, "SP曹仁", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_SP2_SP003CAOREN_JPG, ImageDefine.HEROCARD_SP2_SP003CAOREN_PNG),
    SPPANGTONG(90, "SP庞统", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_SP2_SP004PANGTONG_JPG, ImageDefine.HEROCARD_SP2_SP004PANGTONG_PNG),
    SPZHANGFEI(91, "SP张飞", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_SP2_SP005ZHANGFEI_JPG, ImageDefine.HEROCARD_SP2_SP005ZHANGFEI_PNG),
    SPLVMENG(92, "SP吕蒙", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_SP2_SP006LVMENG_JPG, ImageDefine.HEROCARD_SP2_SP006LVMENG_PNG),
    SPLIUBEI(93, "SP刘备", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_SP2_SP007LIUBEI_JPG, ImageDefine.HEROCARD_SP2_SP007LIUBEI_PNG),
    SPDAQIAO(94, "SP大乔", Sex.female, Kingdom.WU, ImageDefine.HEROCARD_SP2_SP008DAQIAO_JPG, ImageDefine.HEROCARD_SP2_SP008DAQIAO_PNG),
    SPGANNING(95, "SP甘宁", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_SP2_SP009GANNING_JPG, ImageDefine.HEROCARD_SP2_SP009GANNING_PNG),
    SPXIAHOUDUN(96, "SP夏侯惇", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_SP2_SP010XIAHOUDUN_JPG, ImageDefine.HEROCARD_SP2_SP010XIAHOUDUN_PNG),
    CAOZHI(96, "曹植", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ001CAOZHI_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ001CAOZHI_PNG),
    CHENGONG(97, "陈宫", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ002CHENGONG_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ002CHENGONG_PNG),
    FAZHENG(98, "法正", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ003FAZHENG_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ003FAZHENG_PNG),
    GAOSHUN(99, "高顺", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ004GAOSHUN_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ004GAOSHUN_PNG),
    LINGTONG(100, "凌统", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ005LINGTONG_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ005LINGTONG_PNG),
    MASU(101, "马谡", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ006MASU_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ006MASU_PNG),
    WUGUOTAI(102, "吴国太", Sex.female, Kingdom.WU, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ007WUGUOTAI_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ007WUGUOTAI_PNG),
    XUSHENG(103, "徐盛", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ008XUSHENG_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ008XUSHENG_PNG),
    XUSHU(104, "徐庶", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ009XUSHU_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ009XUSHU_PNG),
    YUJIN(105, "于禁", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ010YUJIN_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ010YUJIN_PNG),
    ZHANGCHUNHUA(106, "张春华", Sex.female, Kingdom.WEI, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ011ZHANGCHUNHUA_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2011_YJ011ZHANGCHUNHUA_PNG),
    ZHONGHUI(107, "钟会", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ012ZHONGHUI_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ012ZHONGHUI_PNG),
    BULIANSHI(108, "步练师", Sex.female, Kingdom.WU, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ101BULIANSHI_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ101BULIANSHI_PNG),
    CAOZHANG(109, "曹彰", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ102CAOZHANG_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ102CAOZHANG_PNG),
    CHENGPU(110, "程普", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ103CHENGPU_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ103CHENGPU_PNG),
    GUANGXINGZHANGBAO(111, "关兴张苞", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ104GUANGXINGZHANGBAO_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ104GUANGXINGZHANGBAO_PNG),
    HANDANG(112, "韩当", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ105HANDANG_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ105HANDANG_PNG),
    HUAXIONG(113, "华雄", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ106HUAXIONG_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ106HUAXIONG_PNG),
    LIAOHUA(114, "廖化", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ107LIAOHUA_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ107LIAOHUA_PNG),
    LIUBIAO(115, "刘表", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ108LIUBIAO_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ108LIUBIAO_PNG),
    MADAI(116, "马岱", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ109MADAI_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ109MADAI_PNG),
    WANGYI(117, "王异", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ110WANGYI_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ110WANGYI_PNG),
    XUNYOU(118, "荀攸", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ111XUNYOU_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2012_YJ111XUNYOU_PNG),
    CAOCONG(119, "曹聪", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ201CAOCONG_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ201CAOCONG_PNG),
    FUHUANGHOU(120, "伏皇后", Sex.female, Kingdom.QUN, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ202FUHUANGHOU_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ202FUHUANGHOU_PNG),
    GUANPING(121, "关平", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ203GUANPING_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ203GUANPING_PNG),
    GUOHUAI(122, "郭淮", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ204GUOHUAI_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ204GUOHUAI_PNG),
    JIANYONG(123, "简雍", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ205JIANYONG_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ205JIANYONG_PNG),
    LIRU(124, "李儒", Sex.male, Kingdom.QUN, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ206LIRU_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ206LIRU_PNG),
    LIUFENG(125, "刘封", Sex.male, Kingdom.SHU, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ207LIUFENG_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ207LIUFENG_PNG),
    MANCHONG(126, "满宠", Sex.male, Kingdom.WEI, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ208MANCHONG_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ208MANCHONG_PNG),
    PANZHANGMAZHONG(127, "潘璋马忠", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ209PANZHANGMAZHONG_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ209PANZHANGMAZHONG_PNG),
    YUFAN(128, "虞翻", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ210YUFAN_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ210YUFAN_PNG),
    ZHURAN(129, "朱然", Sex.male, Kingdom.WU, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ211ZHURAN_JPG, ImageDefine.HEROCARD_OVERKNIGHTFAME2013_YJ211ZHURAN_PNG),;
    public static final String CLASS = Thread.currentThread().getStackTrace()[1].getClassName();
    public static final String CAPTION = "武将牌";
    public final int index;
    public final String text;
    public static final String[] itemArray = {
            RANDOM.text,
            CAOCAO.text,
            SIMAYI.text,
            XIAHOUDUN.text,
            ZHANGLIAO.text,
            XUCHU.text,
            GUOJIA.text,
            ZHENJI.text,
            LIUBEI.text,
            GUANYU.text,
            ZHANGFEI.text,
            ZHUGELIANG.text,
            ZHAOYUN.text,
            MACHAO.text,
            HUANGYUEYING.text,
            SUNQUAN.text,
            GANNING.text,
            LVMENG.text,
            HUANGGAI.text,
            ZHOUYU.text,
            DAQIAO.text,
            LUXUN.text,
            SUNSHANGXIANG.text,
            HUATUO.text,
            LVBU.text,
            DIAOCHAN.text,
            SHENGUANYU.text,
            SHENLVMENG.text,
            ZHANGJIAO.text,
            YUJI.text,
            HUANGZHONG.text,
            WEIYAN.text,
            XIAHOUYUAN.text,
            CAOREN.text,
            XIAOQIAO.text,
            ZHOUTAI.text,
            SHENZHOUYU.text,
            SHENZHUGELIANG.text,
            YUANSHAO.text,
            YANLIANG.text,
            PANGDE.text,
            PANGTONG.text,
            FIREZHUGELIANG.text,
            DIANWEI.text,
            XUNYU.text,
            TAISHICI.text,
            SHENCAOCAO.text,
            SHENLVBU.text,
            DONGZHUO.text,
            JIAXU.text,
            MENGHUO.text,
            ZHURONG.text,
            XUHUANG.text,
            CAOPI.text,
            SUNJIAN.text,
            LUSU.text,
            SHENZHAOYUN.text,
            SHENSIMAYI.text,
            ZUOCI.text,
            CAIWENJI.text,
            JIANGWWEI.text,
            LIUSHAN.text,
            ZHANGHE.text,
            DENGAI.text,
            SUNCE.text,
            ZHANGZHAOZHANGHONG.text,
            YANGXIU.text,
            SPDIAOCHAN.text,
            GONGSUNZAN.text,
            YUANSHU.text,
            SPSUNSHANGXIANG.text,
            SPPANGDE.text,
            SPGUANYU.text,
            SPLVBU.text,
            SPLVBUNU.text,
            SPCAIWENJI.text,
            SPMACHAO.text,
            SPJIAXU.text,
            CAOHONG.text,
            GUANYINPING.text,
            SPZHENJI.text,
            SPLIUXIE.text,
            LINGJIU.text,
            FUWAN.text,
            XIAHOUBA.text,
            CHENLIN.text,
            DAQIAOXIAOQIAO.text,
            SPZHAOYUN.text,
            SP2DIAOCHAN.text,
            SP2CAOREN.text,
            SPPANGTONG.text,
            SPZHANGFEI.text,
            SPLVMENG.text,
            SPLIUBEI.text,
            SPDAQIAO.text,
            SPGANNING.text,
            SPXIAHOUDUN.text,
            CAOZHI.text,
            CHENGONG.text,
            FAZHENG.text,
            GAOSHUN.text,
            LINGTONG.text,
            MASU.text,
            WUGUOTAI.text,
            XUSHENG.text,
            XUSHU.text,
            YUJIN.text,
            ZHANGCHUNHUA.text,
            ZHONGHUI.text,
            BULIANSHI.text,
            CAOZHANG.text,
            CHENGPU.text,
            GUANGXINGZHANGBAO.text,
            HANDANG.text,
            HUAXIONG.text,
            LIAOHUA.text,
            LIUBIAO.text,
            MADAI.text,
            WANGYI.text,
            XUNYOU.text,
            CAOCONG.text,
            FUHUANGHOU.text,
            GUANPING.text,
            GUOHUAI.text,
            JIANYONG.text,
            LIRU.text,
            LIUFENG.text,
            MANCHONG.text,
            PANZHANGMAZHONG.text,
            YUFAN.text,
            ZHURAN.text,
    };
    public final Sex sex;
    public final Kingdom kingdom;
    public final String imageAvatar;
    public final String imageHeroCard;

    private HeroCard(int index, String text, Sex sex, Kingdom kingdom, String imageAvatar, String imageHeroCard) {
        this.index = index;
        this.text = text;
        this.sex = sex;
        this.kingdom = kingdom;
        this.imageAvatar = imageAvatar;
        this.imageHeroCard = imageHeroCard;
    }

    public static Sex getSex(String FROM_CLASS, String FROM_METHOD, int index) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        Sex returnValue = Sex.male;
        for (HeroCard heroCard : HeroCard.values()) {
            if (index == heroCard.index) {
                returnValue = heroCard.sex;
                break;
            }
        }

        Log.write(METHOD + "(" + index + ")" + " returns " + returnValue);
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
        return returnValue;
    }

    public static Kingdom getKingdom(String FROM_CLASS, String FROM_METHOD, int index) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        Kingdom returnValue = Kingdom.RANDOM;
        for (HeroCard heroCard : HeroCard.values()) {
            if (index == heroCard.index) {
                returnValue = heroCard.kingdom;
                break;
            }
        }

        Log.write(METHOD + "(" + index + ")" + " returns " + returnValue);
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
        return returnValue;
    }

    public static String getAvatar(String FROM_CLASS, String FROM_METHOD, int index) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        String returnValue = "";
        for (HeroCard heroCard : HeroCard.values()) {
            if (index == heroCard.index) {
                returnValue = heroCard.imageAvatar;
                break;
            }
        }

        Log.write(METHOD + "(" + index + ")" + " returns " + returnValue);
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
        return returnValue;
    }

    public static String getHeroCard(String FROM_CLASS, String FROM_METHOD, int index) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        String returnValue = "";
        for (HeroCard heroCard : HeroCard.values()) {
            if (index == heroCard.index) {
                returnValue = heroCard.imageHeroCard;
                break;
            }
        }

        Log.write(METHOD + "(" + index + ")" + " returns " + returnValue);
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
        return returnValue;
    }
}
