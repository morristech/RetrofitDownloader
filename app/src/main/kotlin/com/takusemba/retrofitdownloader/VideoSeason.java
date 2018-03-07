// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video.proto at 100:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * / ビデオシーズン
 */
public final class VideoSeason extends Message<VideoSeason, VideoSeason.Builder> {
  public static final ProtoAdapter<VideoSeason> ADAPTER = new ProtoAdapter_VideoSeason();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ID = "";

  public static final Integer DEFAULT_SEQUENCE = 0;

  public static final String DEFAULT_NAME = "";

  /**
   * / シーズンID
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String id;

  /**
   * / シーズン番号
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer sequence;

  /**
   * / シーズン表記
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  public VideoSeason(String id, Integer sequence, String name) {
    this(id, sequence, name, ByteString.EMPTY);
  }

  public VideoSeason(String id, Integer sequence, String name, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.sequence = sequence;
    this.name = name;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.sequence = sequence;
    builder.name = name;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VideoSeason)) return false;
    VideoSeason o = (VideoSeason) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(sequence, o.sequence)
        && Internal.equals(name, o.name);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (sequence != null ? sequence.hashCode() : 0);
      result = result * 37 + (name != null ? name.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (sequence != null) builder.append(", sequence=").append(sequence);
    if (name != null) builder.append(", name=").append(name);
    return builder.replace(0, 2, "VideoSeason{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<VideoSeason, Builder> {
    public String id;

    public Integer sequence;

    public String name;

    public Builder() {
    }

    /**
     * / シーズンID
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * / シーズン番号
     */
    public Builder sequence(Integer sequence) {
      this.sequence = sequence;
      return this;
    }

    /**
     * / シーズン表記
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    @Override
    public VideoSeason build() {
      return new VideoSeason(id, sequence, name, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_VideoSeason extends ProtoAdapter<VideoSeason> {
    ProtoAdapter_VideoSeason() {
      super(FieldEncoding.LENGTH_DELIMITED, VideoSeason.class);
    }

    @Override
    public int encodedSize(VideoSeason value) {
      return (value.id != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.id) : 0)
          + (value.sequence != null ? ProtoAdapter.INT32.encodedSizeWithTag(2, value.sequence) : 0)
          + (value.name != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.name) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, VideoSeason value) throws IOException {
      if (value.id != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
      if (value.sequence != null) ProtoAdapter.INT32.encodeWithTag(writer, 2, value.sequence);
      if (value.name != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.name);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public VideoSeason decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.sequence(ProtoAdapter.INT32.decode(reader)); break;
          case 3: builder.name(ProtoAdapter.STRING.decode(reader)); break;
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
    public VideoSeason redact(VideoSeason value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}