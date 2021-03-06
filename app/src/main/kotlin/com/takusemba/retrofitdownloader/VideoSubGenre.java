// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video.proto at 120:1
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
 * / ビデオサブジャンル
 */
public final class VideoSubGenre extends Message<VideoSubGenre, VideoSubGenre.Builder> {
  public static final ProtoAdapter<VideoSubGenre> ADAPTER = new ProtoAdapter_VideoSubGenre();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ID = "";

  public static final String DEFAULT_NAME = "";

  /**
   * / サブジャンルID
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String id;

  /**
   * / サブジャンル表記
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  public VideoSubGenre(String id, String name) {
    this(id, name, ByteString.EMPTY);
  }

  public VideoSubGenre(String id, String name, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.name = name;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.name = name;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VideoSubGenre)) return false;
    VideoSubGenre o = (VideoSubGenre) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(name, o.name);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (name != null ? name.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (name != null) builder.append(", name=").append(name);
    return builder.replace(0, 2, "VideoSubGenre{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<VideoSubGenre, Builder> {
    public String id;

    public String name;

    public Builder() {
    }

    /**
     * / サブジャンルID
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * / サブジャンル表記
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    @Override
    public VideoSubGenre build() {
      return new VideoSubGenre(id, name, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_VideoSubGenre extends ProtoAdapter<VideoSubGenre> {
    ProtoAdapter_VideoSubGenre() {
      super(FieldEncoding.LENGTH_DELIMITED, VideoSubGenre.class);
    }

    @Override
    public int encodedSize(VideoSubGenre value) {
      return (value.id != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.id) : 0)
          + (value.name != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.name) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, VideoSubGenre value) throws IOException {
      if (value.id != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
      if (value.name != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.name);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public VideoSubGenre decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.name(ProtoAdapter.STRING.decode(reader)); break;
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
    public VideoSubGenre redact(VideoSubGenre value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
