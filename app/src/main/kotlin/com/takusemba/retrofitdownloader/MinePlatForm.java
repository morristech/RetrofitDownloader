// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/track.proto at 61:1
package tv.abema.protos;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.lang.Override;

public enum MinePlatForm implements WireEnum {
  web(0),

  native_app(1),

  tv(2);

  public static final ProtoAdapter<MinePlatForm> ADAPTER = ProtoAdapter.newEnumAdapter(MinePlatForm.class);

  private final int value;

  MinePlatForm(int value) {
    this.value = value;
  }

  /**
   * Return the constant for {@code value} or null.
   */
  public static MinePlatForm fromValue(int value) {
    switch (value) {
      case 0: return web;
      case 1: return native_app;
      case 2: return tv;
      default: return null;
    }
  }

  @Override
  public int getValue() {
    return value;
  }
}