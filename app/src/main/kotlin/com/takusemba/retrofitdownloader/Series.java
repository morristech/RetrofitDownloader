// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/media.proto at 225:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * / シリーズ情報
 */
public final class Series extends Message<Series, Series.Builder> {
  public static final ProtoAdapter<Series> ADAPTER = new ProtoAdapter_Series();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ID = "";

  public static final Long DEFAULT_UPDATEDAT = 0L;

  /**
   * / シリーズID
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String id;

  /**
   * / テーマカラー
   */
  @WireField(
      tag = 2,
      adapter = "tv.abema.protos.SeriesThemeColor#ADAPTER"
  )
  public final SeriesThemeColor themeColor;

  /**
   * / 更新時刻
   */
  @WireField(
      tag = 15,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long updatedAt;

  public Series(String id, SeriesThemeColor themeColor, Long updatedAt) {
    this(id, themeColor, updatedAt, ByteString.EMPTY);
  }

  public Series(String id, SeriesThemeColor themeColor, Long updatedAt, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.themeColor = themeColor;
    this.updatedAt = updatedAt;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.themeColor = themeColor;
    builder.updatedAt = updatedAt;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Series)) return false;
    Series o = (Series) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(themeColor, o.themeColor)
        && Internal.equals(updatedAt, o.updatedAt);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (themeColor != null ? themeColor.hashCode() : 0);
      result = result * 37 + (updatedAt != null ? updatedAt.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (themeColor != null) builder.append(", themeColor=").append(themeColor);
    if (updatedAt != null) builder.append(", updatedAt=").append(updatedAt);
    return builder.replace(0, 2, "Series{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Series, Builder> {
    public String id;

    public SeriesThemeColor themeColor;

    public Long updatedAt;

    public Builder() {
    }

    /**
     * / シリーズID
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * / テーマカラー
     */
    public Builder themeColor(SeriesThemeColor themeColor) {
      this.themeColor = themeColor;
      return this;
    }

    /**
     * / 更新時刻
     */
    public Builder updatedAt(Long updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    @Override
    public Series build() {
      return new Series(id, themeColor, updatedAt, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Series extends ProtoAdapter<Series> {
    ProtoAdapter_Series() {
      super(FieldEncoding.LENGTH_DELIMITED, Series.class);
    }

    @Override
    public int encodedSize(Series value) {
      return (value.id != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.id) : 0)
          + (value.themeColor != null ? SeriesThemeColor.ADAPTER.encodedSizeWithTag(2, value.themeColor) : 0)
          + (value.updatedAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(15, value.updatedAt) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Series value) throws IOException {
      if (value.id != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
      if (value.themeColor != null) SeriesThemeColor.ADAPTER.encodeWithTag(writer, 2, value.themeColor);
      if (value.updatedAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 15, value.updatedAt);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Series decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.themeColor(SeriesThemeColor.ADAPTER.decode(reader)); break;
          case 15: builder.updatedAt(ProtoAdapter.INT64.decode(reader)); break;
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
    public Series redact(Series value) {
      Builder builder = value.newBuilder();
      if (builder.themeColor != null) builder.themeColor = SeriesThemeColor.ADAPTER.redact(builder.themeColor);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
