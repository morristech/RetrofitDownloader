// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/track.proto at 196:1
package tv.abema.protos;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.lang.Override;

public enum MineSnsType implements WireEnum {
  sns_twitter(0),

  sns_facebook(1),

  sns_line(2),

  sns_other(3),

  sns_abema(4);

  public static final ProtoAdapter<MineSnsType> ADAPTER = ProtoAdapter.newEnumAdapter(MineSnsType.class);

  private final int value;

  MineSnsType(int value) {
    this.value = value;
  }

  /**
   * Return the constant for {@code value} or null.
   */
  public static MineSnsType fromValue(int value) {
    switch (value) {
      case 0: return sns_twitter;
      case 1: return sns_facebook;
      case 2: return sns_line;
      case 3: return sns_other;
      case 4: return sns_abema;
      default: return null;
    }
  }

  @Override
  public int getValue() {
    return value;
  }
}
