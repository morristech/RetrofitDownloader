// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/playback.proto at 11:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * / スロット再生情報
 */
public final class SlotPlayback extends Message<SlotPlayback, SlotPlayback.Builder> {
  public static final ProtoAdapter<SlotPlayback> ADAPTER = new ProtoAdapter_SlotPlayback();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_HLS = "";

  public static final String DEFAULT_DASH = "";

  /**
   * / HLS用プレイリストURL
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hls;

  /**
   * / MPEG-DASH用プレイリストURL
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String dash;

  public SlotPlayback(String hls, String dash) {
    this(hls, dash, ByteString.EMPTY);
  }

  public SlotPlayback(String hls, String dash, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.hls = hls;
    this.dash = dash;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.hls = hls;
    builder.dash = dash;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SlotPlayback)) return false;
    SlotPlayback o = (SlotPlayback) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(hls, o.hls)
        && Internal.equals(dash, o.dash);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (hls != null ? hls.hashCode() : 0);
      result = result * 37 + (dash != null ? dash.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (hls != null) builder.append(", hls=").append(hls);
    if (dash != null) builder.append(", dash=").append(dash);
    return builder.replace(0, 2, "SlotPlayback{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<SlotPlayback, Builder> {
    public String hls;

    public String dash;

    public Builder() {
    }

    /**
     * / HLS用プレイリストURL
     */
    public Builder hls(String hls) {
      this.hls = hls;
      return this;
    }

    /**
     * / MPEG-DASH用プレイリストURL
     */
    public Builder dash(String dash) {
      this.dash = dash;
      return this;
    }

    @Override
    public SlotPlayback build() {
      return new SlotPlayback(hls, dash, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_SlotPlayback extends ProtoAdapter<SlotPlayback> {
    ProtoAdapter_SlotPlayback() {
      super(FieldEncoding.LENGTH_DELIMITED, SlotPlayback.class);
    }

    @Override
    public int encodedSize(SlotPlayback value) {
      return (value.hls != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.hls) : 0)
          + (value.dash != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.dash) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SlotPlayback value) throws IOException {
      if (value.hls != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.hls);
      if (value.dash != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.dash);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SlotPlayback decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.hls(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.dash(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public SlotPlayback redact(SlotPlayback value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
