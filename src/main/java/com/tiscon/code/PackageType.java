package com.tiscon.code;

/**
 * 荷物の種類コード。
 *
 * @author Oikawa Yumi
 */
public enum PackageType implements CodeEnum {

    /** 段ボール */
    BOX(1, "段ボール"),
    /** ベッド */
    BED(2, "ベッド"),
    /** 自転車 */
    BICYCLE(3, "自転車"),
    /** 洗濯機 */
    WASHING_MACHINE(4, "洗濯機"),
    /**テレビ */
    TV(5, "テレビ"),
    /**ソファー */
    SOFA(6,"ソファー"),
     /**タンス */
     TANSU(7,"タンス"),
      /**テーブル */
    TABLE(6,"テーブル"),
     /**いす */
     CHAIR(6,"いす");




    /** 荷物のラベル */
    private final String label;
    /** 荷物のラベルのコード */
    private final int code;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル
     */
    PackageType(int code, String label) {
        this.label = label;
        this.code = code;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public int getCode() {
        return code;
    }
}
