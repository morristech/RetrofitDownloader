// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video_feature.proto at 12:1
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
import java.util.List;
import okio.ByteString;

/**
 * / ビデオカード
 */
public final class VideoCard extends Message<VideoCard, VideoCard.Builder> {
  public static final ProtoAdapter<VideoCard> ADAPTER = new ProtoAdapter_VideoCard();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  public static final String DEFAULT_SERIESID = "";

  public static final String DEFAULT_PROGRAMID = "";

  public static final String DEFAULT_TITLE = "";

  public static final String DEFAULT_CAPTION = "";

  public static final String DEFAULT_CONTENT = "";

  public static final Long DEFAULT_IMAGEUPDATEDAT = 0L;

  public static final String DEFAULT_SUBTITLE = "";

  public static final String DEFAULT_CHANNELID = "";

  public static final String DEFAULT_CHANNELNAME = "";

  public static final String DEFAULT_SLOTID = "";

  public static final Long DEFAULT_SLOTSTARTAT = 0L;

  public static final Long DEFAULT_SLOTENDAT = 0L;

  /**
   * / 効果測定用文字列
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  /**
   * / シリーズID
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String seriesId;

  /**
   * / 番組ID
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String programId;

  /**
   * / 番組納品情報
   */
  @WireField(
      tag = 4,
      adapter = "tv.abema.protos.VideoProgramProvidedInfo#ADAPTER"
  )
  public final VideoProgramProvidedInfo programProvidedInfo;

  /**
   * / ジャンル
   */
  @WireField(
      tag = 5,
      adapter = "tv.abema.protos.VideoGenre#ADAPTER"
  )
  public final VideoGenre genre;

  /**
   * / タイトル
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String title;

  /**
   * / 見出し（シリーズ特集枠の場合はシリーズ見出し、プログラム特集枠＆自動再生プログラム特集枠の場合はエピソード見出しがセットされる）
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String caption;

  /**
   * / コンテンツ
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String content;

  /**
   * / コピーライト一覧
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> copyrights;

  /**
   * / ラベル
   */
  @WireField(
      tag = 10,
      adapter = "tv.abema.protos.VideoCardLabel#ADAPTER"
  )
  public final VideoCardLabel label;

  /**
   * / 画像更新時刻
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long imageUpdatedAt;

  /**
   * / サブタイトル（プログラム特集枠＆自動再生プログラム特集枠の場合はシリーズタイトルがセットされる）
   */
  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String subTitle;

  @WireField(
      tag = 13,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String channelId;

  @WireField(
      tag = 14,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String channelName;

  @WireField(
      tag = 15,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String slotId;

  @WireField(
      tag = 16,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long slotStartAt;

  @WireField(
      tag = 17,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long slotEndAt;

  /**
   * / メディアステータス（プログラム特集枠＆自動再生プログラム特集枠の場合にセットされる）
   */
  @WireField(
      tag = 18,
      adapter = "tv.abema.protos.VideoProgramMediaStatus#ADAPTER"
  )
  public final VideoProgramMediaStatus mediaStatus;

  public VideoCard(String name, String seriesId, String programId, VideoProgramProvidedInfo programProvidedInfo, VideoGenre genre, String title, String caption, String content, List<String> copyrights, VideoCardLabel label, Long imageUpdatedAt, String subTitle, String channelId, String channelName, String slotId, Long slotStartAt, Long slotEndAt, VideoProgramMediaStatus mediaStatus) {
    this(name, seriesId, programId, programProvidedInfo, genre, title, caption, content, copyrights, label, imageUpdatedAt, subTitle, channelId, channelName, slotId, slotStartAt, slotEndAt, mediaStatus, ByteString.EMPTY);
  }

  public VideoCard(String name, String seriesId, String programId, VideoProgramProvidedInfo programProvidedInfo, VideoGenre genre, String title, String caption, String content, List<String> copyrights, VideoCardLabel label, Long imageUpdatedAt, String subTitle, String channelId, String channelName, String slotId, Long slotStartAt, Long slotEndAt, VideoProgramMediaStatus mediaStatus, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.name = name;
    this.seriesId = seriesId;
    this.programId = programId;
    this.programProvidedInfo = programProvidedInfo;
    this.genre = genre;
    this.title = title;
    this.caption = caption;
    this.content = content;
    this.copyrights = Internal.immutableCopyOf("copyrights", copyrights);
    this.label = label;
    this.imageUpdatedAt = imageUpdatedAt;
    this.subTitle = subTitle;
    this.channelId = channelId;
    this.channelName = channelName;
    this.slotId = slotId;
    this.slotStartAt = slotStartAt;
    this.slotEndAt = slotEndAt;
    this.mediaStatus = mediaStatus;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.name = name;
    builder.seriesId = seriesId;
    builder.programId = programId;
    builder.programProvidedInfo = programProvidedInfo;
    builder.genre = genre;
    builder.title = title;
    builder.caption = caption;
    builder.content = content;
    builder.copyrights = Internal.copyOf("copyrights", copyrights);
    builder.label = label;
    builder.imageUpdatedAt = imageUpdatedAt;
    builder.subTitle = subTitle;
    builder.channelId = channelId;
    builder.channelName = channelName;
    builder.slotId = slotId;
    builder.slotStartAt = slotStartAt;
    builder.slotEndAt = slotEndAt;
    builder.mediaStatus = mediaStatus;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VideoCard)) return false;
    VideoCard o = (VideoCard) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(name, o.name)
        && Internal.equals(seriesId, o.seriesId)
        && Internal.equals(programId, o.programId)
        && Internal.equals(programProvidedInfo, o.programProvidedInfo)
        && Internal.equals(genre, o.genre)
        && Internal.equals(title, o.title)
        && Internal.equals(caption, o.caption)
        && Internal.equals(content, o.content)
        && Internal.equals(copyrights, o.copyrights)
        && Internal.equals(label, o.label)
        && Internal.equals(imageUpdatedAt, o.imageUpdatedAt)
        && Internal.equals(subTitle, o.subTitle)
        && Internal.equals(channelId, o.channelId)
        && Internal.equals(channelName, o.channelName)
        && Internal.equals(slotId, o.slotId)
        && Internal.equals(slotStartAt, o.slotStartAt)
        && Internal.equals(slotEndAt, o.slotEndAt)
        && Internal.equals(mediaStatus, o.mediaStatus);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (seriesId != null ? seriesId.hashCode() : 0);
      result = result * 37 + (programId != null ? programId.hashCode() : 0);
      result = result * 37 + (programProvidedInfo != null ? programProvidedInfo.hashCode() : 0);
      result = result * 37 + (genre != null ? genre.hashCode() : 0);
      result = result * 37 + (title != null ? title.hashCode() : 0);
      result = result * 37 + (caption != null ? caption.hashCode() : 0);
      result = result * 37 + (content != null ? content.hashCode() : 0);
      result = result * 37 + (copyrights != null ? copyrights.hashCode() : 1);
      result = result * 37 + (label != null ? label.hashCode() : 0);
      result = result * 37 + (imageUpdatedAt != null ? imageUpdatedAt.hashCode() : 0);
      result = result * 37 + (subTitle != null ? subTitle.hashCode() : 0);
      result = result * 37 + (channelId != null ? channelId.hashCode() : 0);
      result = result * 37 + (channelName != null ? channelName.hashCode() : 0);
      result = result * 37 + (slotId != null ? slotId.hashCode() : 0);
      result = result * 37 + (slotStartAt != null ? slotStartAt.hashCode() : 0);
      result = result * 37 + (slotEndAt != null ? slotEndAt.hashCode() : 0);
      result = result * 37 + (mediaStatus != null ? mediaStatus.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (name != null) builder.append(", name=").append(name);
    if (seriesId != null) builder.append(", seriesId=").append(seriesId);
    if (programId != null) builder.append(", programId=").append(programId);
    if (programProvidedInfo != null) builder.append(", programProvidedInfo=").append(programProvidedInfo);
    if (genre != null) builder.append(", genre=").append(genre);
    if (title != null) builder.append(", title=").append(title);
    if (caption != null) builder.append(", caption=").append(caption);
    if (content != null) builder.append(", content=").append(content);
    if (copyrights != null) builder.append(", copyrights=").append(copyrights);
    if (label != null) builder.append(", label=").append(label);
    if (imageUpdatedAt != null) builder.append(", imageUpdatedAt=").append(imageUpdatedAt);
    if (subTitle != null) builder.append(", subTitle=").append(subTitle);
    if (channelId != null) builder.append(", channelId=").append(channelId);
    if (channelName != null) builder.append(", channelName=").append(channelName);
    if (slotId != null) builder.append(", slotId=").append(slotId);
    if (slotStartAt != null) builder.append(", slotStartAt=").append(slotStartAt);
    if (slotEndAt != null) builder.append(", slotEndAt=").append(slotEndAt);
    if (mediaStatus != null) builder.append(", mediaStatus=").append(mediaStatus);
    return builder.replace(0, 2, "VideoCard{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<VideoCard, Builder> {
    public String name;

    public String seriesId;

    public String programId;

    public VideoProgramProvidedInfo programProvidedInfo;

    public VideoGenre genre;

    public String title;

    public String caption;

    public String content;

    public List<String> copyrights;

    public VideoCardLabel label;

    public Long imageUpdatedAt;

    public String subTitle;

    public String channelId;

    public String channelName;

    public String slotId;

    public Long slotStartAt;

    public Long slotEndAt;

    public VideoProgramMediaStatus mediaStatus;

    public Builder() {
      copyrights = Internal.newMutableList();
    }

    /**
     * / 効果測定用文字列
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * / シリーズID
     */
    public Builder seriesId(String seriesId) {
      this.seriesId = seriesId;
      return this;
    }

    /**
     * / 番組ID
     */
    public Builder programId(String programId) {
      this.programId = programId;
      return this;
    }

    /**
     * / 番組納品情報
     */
    public Builder programProvidedInfo(VideoProgramProvidedInfo programProvidedInfo) {
      this.programProvidedInfo = programProvidedInfo;
      return this;
    }

    /**
     * / ジャンル
     */
    public Builder genre(VideoGenre genre) {
      this.genre = genre;
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
     * / 見出し（シリーズ特集枠の場合はシリーズ見出し、プログラム特集枠＆自動再生プログラム特集枠の場合はエピソード見出しがセットされる）
     */
    public Builder caption(String caption) {
      this.caption = caption;
      return this;
    }

    /**
     * / コンテンツ
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * / コピーライト一覧
     */
    public Builder copyrights(List<String> copyrights) {
      Internal.checkElementsNotNull(copyrights);
      this.copyrights = copyrights;
      return this;
    }

    /**
     * / ラベル
     */
    public Builder label(VideoCardLabel label) {
      this.label = label;
      return this;
    }

    /**
     * / 画像更新時刻
     */
    public Builder imageUpdatedAt(Long imageUpdatedAt) {
      this.imageUpdatedAt = imageUpdatedAt;
      return this;
    }

    /**
     * / サブタイトル（プログラム特集枠＆自動再生プログラム特集枠の場合はシリーズタイトルがセットされる）
     */
    public Builder subTitle(String subTitle) {
      this.subTitle = subTitle;
      return this;
    }

    public Builder channelId(String channelId) {
      this.channelId = channelId;
      return this;
    }

    public Builder channelName(String channelName) {
      this.channelName = channelName;
      return this;
    }

    public Builder slotId(String slotId) {
      this.slotId = slotId;
      return this;
    }

    public Builder slotStartAt(Long slotStartAt) {
      this.slotStartAt = slotStartAt;
      return this;
    }

    public Builder slotEndAt(Long slotEndAt) {
      this.slotEndAt = slotEndAt;
      return this;
    }

    /**
     * / メディアステータス（プログラム特集枠＆自動再生プログラム特集枠の場合にセットされる）
     */
    public Builder mediaStatus(VideoProgramMediaStatus mediaStatus) {
      this.mediaStatus = mediaStatus;
      return this;
    }

    @Override
    public VideoCard build() {
      return new VideoCard(name, seriesId, programId, programProvidedInfo, genre, title, caption, content, copyrights, label, imageUpdatedAt, subTitle, channelId, channelName, slotId, slotStartAt, slotEndAt, mediaStatus, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_VideoCard extends ProtoAdapter<VideoCard> {
    ProtoAdapter_VideoCard() {
      super(FieldEncoding.LENGTH_DELIMITED, VideoCard.class);
    }

    @Override
    public int encodedSize(VideoCard value) {
      return (value.name != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.name) : 0)
          + (value.seriesId != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.seriesId) : 0)
          + (value.programId != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.programId) : 0)
          + (value.programProvidedInfo != null ? VideoProgramProvidedInfo.ADAPTER.encodedSizeWithTag(4, value.programProvidedInfo) : 0)
          + (value.genre != null ? VideoGenre.ADAPTER.encodedSizeWithTag(5, value.genre) : 0)
          + (value.title != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.title) : 0)
          + (value.caption != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.caption) : 0)
          + (value.content != null ? ProtoAdapter.STRING.encodedSizeWithTag(8, value.content) : 0)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, value.copyrights)
          + (value.label != null ? VideoCardLabel.ADAPTER.encodedSizeWithTag(10, value.label) : 0)
          + (value.imageUpdatedAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(11, value.imageUpdatedAt) : 0)
          + (value.subTitle != null ? ProtoAdapter.STRING.encodedSizeWithTag(12, value.subTitle) : 0)
          + (value.channelId != null ? ProtoAdapter.STRING.encodedSizeWithTag(13, value.channelId) : 0)
          + (value.channelName != null ? ProtoAdapter.STRING.encodedSizeWithTag(14, value.channelName) : 0)
          + (value.slotId != null ? ProtoAdapter.STRING.encodedSizeWithTag(15, value.slotId) : 0)
          + (value.slotStartAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(16, value.slotStartAt) : 0)
          + (value.slotEndAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(17, value.slotEndAt) : 0)
          + (value.mediaStatus != null ? VideoProgramMediaStatus.ADAPTER.encodedSizeWithTag(18, value.mediaStatus) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, VideoCard value) throws IOException {
      if (value.name != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name);
      if (value.seriesId != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.seriesId);
      if (value.programId != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.programId);
      if (value.programProvidedInfo != null) VideoProgramProvidedInfo.ADAPTER.encodeWithTag(writer, 4, value.programProvidedInfo);
      if (value.genre != null) VideoGenre.ADAPTER.encodeWithTag(writer, 5, value.genre);
      if (value.title != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.title);
      if (value.caption != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.caption);
      if (value.content != null) ProtoAdapter.STRING.encodeWithTag(writer, 8, value.content);
      if (value.copyrights != null) ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 9, value.copyrights);
      if (value.label != null) VideoCardLabel.ADAPTER.encodeWithTag(writer, 10, value.label);
      if (value.imageUpdatedAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 11, value.imageUpdatedAt);
      if (value.subTitle != null) ProtoAdapter.STRING.encodeWithTag(writer, 12, value.subTitle);
      if (value.channelId != null) ProtoAdapter.STRING.encodeWithTag(writer, 13, value.channelId);
      if (value.channelName != null) ProtoAdapter.STRING.encodeWithTag(writer, 14, value.channelName);
      if (value.slotId != null) ProtoAdapter.STRING.encodeWithTag(writer, 15, value.slotId);
      if (value.slotStartAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 16, value.slotStartAt);
      if (value.slotEndAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 17, value.slotEndAt);
      if (value.mediaStatus != null) VideoProgramMediaStatus.ADAPTER.encodeWithTag(writer, 18, value.mediaStatus);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public VideoCard decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.seriesId(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.programId(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.programProvidedInfo(VideoProgramProvidedInfo.ADAPTER.decode(reader)); break;
          case 5: builder.genre(VideoGenre.ADAPTER.decode(reader)); break;
          case 6: builder.title(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.caption(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.content(ProtoAdapter.STRING.decode(reader)); break;
          case 9: builder.copyrights.add(ProtoAdapter.STRING.decode(reader)); break;
          case 10: builder.label(VideoCardLabel.ADAPTER.decode(reader)); break;
          case 11: builder.imageUpdatedAt(ProtoAdapter.INT64.decode(reader)); break;
          case 12: builder.subTitle(ProtoAdapter.STRING.decode(reader)); break;
          case 13: builder.channelId(ProtoAdapter.STRING.decode(reader)); break;
          case 14: builder.channelName(ProtoAdapter.STRING.decode(reader)); break;
          case 15: builder.slotId(ProtoAdapter.STRING.decode(reader)); break;
          case 16: builder.slotStartAt(ProtoAdapter.INT64.decode(reader)); break;
          case 17: builder.slotEndAt(ProtoAdapter.INT64.decode(reader)); break;
          case 18: builder.mediaStatus(VideoProgramMediaStatus.ADAPTER.decode(reader)); break;
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
    public VideoCard redact(VideoCard value) {
      Builder builder = value.newBuilder();
      if (builder.programProvidedInfo != null) builder.programProvidedInfo = VideoProgramProvidedInfo.ADAPTER.redact(builder.programProvidedInfo);
      if (builder.genre != null) builder.genre = VideoGenre.ADAPTER.redact(builder.genre);
      if (builder.label != null) builder.label = VideoCardLabel.ADAPTER.redact(builder.label);
      if (builder.mediaStatus != null) builder.mediaStatus = VideoProgramMediaStatus.ADAPTER.redact(builder.mediaStatus);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}