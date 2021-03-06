// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video_feature.proto at 46:1
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
import java.util.List;
import okio.ByteString;

/**
 * / ビデオ特集枠
 */
public final class VideoFeature extends Message<VideoFeature, VideoFeature.Builder> {
  public static final ProtoAdapter<VideoFeature> ADAPTER = new ProtoAdapter_VideoFeature();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  public static final VideoFeatureType DEFAULT_TYPE = VideoFeatureType.UNKNOWN;

  public static final String DEFAULT_TITLE = "";

  public static final String DEFAULT_VERSION = "";

  /**
   * / 効果測定用文字列
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  /**
   * / タイプ
   */
  @WireField(
      tag = 2,
      adapter = "tv.abema.protos.VideoFeatureType#ADAPTER"
  )
  public final VideoFeatureType type;

  /**
   * / タイトル
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String title;

  /**
   * / カード一覧
   */
  @WireField(
      tag = 4,
      adapter = "tv.abema.protos.VideoCard#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<VideoCard> cards;

  /**
   * / 特集バージョン
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String version;

  public VideoFeature(String name, VideoFeatureType type, String title, List<VideoCard> cards, String version) {
    this(name, type, title, cards, version, ByteString.EMPTY);
  }

  public VideoFeature(String name, VideoFeatureType type, String title, List<VideoCard> cards, String version, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.name = name;
    this.type = type;
    this.title = title;
    this.cards = Internal.immutableCopyOf("cards", cards);
    this.version = version;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.name = name;
    builder.type = type;
    builder.title = title;
    builder.cards = Internal.copyOf("cards", cards);
    builder.version = version;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VideoFeature)) return false;
    VideoFeature o = (VideoFeature) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(name, o.name)
        && Internal.equals(type, o.type)
        && Internal.equals(title, o.title)
        && Internal.equals(cards, o.cards)
        && Internal.equals(version, o.version);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (type != null ? type.hashCode() : 0);
      result = result * 37 + (title != null ? title.hashCode() : 0);
      result = result * 37 + (cards != null ? cards.hashCode() : 1);
      result = result * 37 + (version != null ? version.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (name != null) builder.append(", name=").append(name);
    if (type != null) builder.append(", type=").append(type);
    if (title != null) builder.append(", title=").append(title);
    if (cards != null) builder.append(", cards=").append(cards);
    if (version != null) builder.append(", version=").append(version);
    return builder.replace(0, 2, "VideoFeature{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<VideoFeature, Builder> {
    public String name;

    public VideoFeatureType type;

    public String title;

    public List<VideoCard> cards;

    public String version;

    public Builder() {
      cards = Internal.newMutableList();
    }

    /**
     * / 効果測定用文字列
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * / タイプ
     */
    public Builder type(VideoFeatureType type) {
      this.type = type;
      return this;
    }

    /**
     * / タイトル
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * / カード一覧
     */
    public Builder cards(List<VideoCard> cards) {
      Internal.checkElementsNotNull(cards);
      this.cards = cards;
      return this;
    }

    /**
     * / 特集バージョン
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    @Override
    public VideoFeature build() {
      return new VideoFeature(name, type, title, cards, version, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_VideoFeature extends ProtoAdapter<VideoFeature> {
    ProtoAdapter_VideoFeature() {
      super(FieldEncoding.LENGTH_DELIMITED, VideoFeature.class);
    }

    @Override
    public int encodedSize(VideoFeature value) {
      return (value.name != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.name) : 0)
          + (value.type != null ? VideoFeatureType.ADAPTER.encodedSizeWithTag(2, value.type) : 0)
          + (value.title != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.title) : 0)
          + VideoCard.ADAPTER.asRepeated().encodedSizeWithTag(4, value.cards)
          + (value.version != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.version) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, VideoFeature value) throws IOException {
      if (value.name != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name);
      if (value.type != null) VideoFeatureType.ADAPTER.encodeWithTag(writer, 2, value.type);
      if (value.title != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.title);
      if (value.cards != null) VideoCard.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.cards);
      if (value.version != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.version);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public VideoFeature decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 2: {
            try {
              builder.type(VideoFeatureType.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 3: builder.title(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.cards.add(VideoCard.ADAPTER.decode(reader)); break;
          case 5: builder.version(ProtoAdapter.STRING.decode(reader)); break;
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
    public VideoFeature redact(VideoFeature value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.cards, VideoCard.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
