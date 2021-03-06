// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/highlight_popup.proto at 34:1
package tv.abema.protos;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.lang.Override;

/**
 * / ポップアップタイプ
 */
public enum DailyHighlightPopupType implements WireEnum {
  /**
   * / 未来・現在の放送枠用ポップアップ
   */
  SCHEDULED(0),

  /**
   * / 過去(タイムシフト)の放送枠用ポップアップ
   */
  TIMESHIFT(1);

  public static final ProtoAdapter<DailyHighlightPopupType> ADAPTER = ProtoAdapter.newEnumAdapter(DailyHighlightPopupType.class);

  private final int value;

  DailyHighlightPopupType(int value) {
    this.value = value;
  }

  /**
   * Return the constant for {@code value} or null.
   */
  public static DailyHighlightPopupType fromValue(int value) {
    switch (value) {
      case 0: return SCHEDULED;
      case 1: return TIMESHIFT;
      default: return null;
    }
  }

  @Override
  public int getValue() {
    return value;
  }
}
