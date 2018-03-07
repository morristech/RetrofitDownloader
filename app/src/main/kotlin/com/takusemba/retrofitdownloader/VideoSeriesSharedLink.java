// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video.proto at 158:1
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
 * ビデオシリーズの共有リンク
 */
public final class VideoSeriesSharedLink extends Message<VideoSeriesSharedLink, VideoSeriesSharedLink.Builder> {
  public static final ProtoAdapter<VideoSeriesSharedLink> ADAPTER = new ProtoAdapter_VideoSeriesSharedLink();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_TWITTER = "";

  public static final String DEFAULT_FACEBOOK = "";

  public static final String DEFAULT_GOOGLE = "";

  public static final String DEFAULT_LINE = "";

  public static final String DEFAULT_COPY = "";

  /**
   * / Twitter
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String twitter;

  /**
   * / Facebook
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String facebook;

  /**
   * / Google+
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String google;

  /**
   * / Line
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String line;

  /**
   * / リンクをコピー
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String copy;

  public VideoSeriesSharedLink(String twitter, String facebook, String google, String line, String copy) {
    this(twitter, facebook, google, line, copy, ByteString.EMPTY);
  }

  public VideoSeriesSharedLink(String twitter, String facebook, String google, String line, String copy, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.twitter = twitter;
    this.facebook = facebook;
    this.google = google;
    this.line = line;
    this.copy = copy;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.twitter = twitter;
    builder.facebook = facebook;
    builder.google = google;
    builder.line = line;
    builder.copy = copy;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VideoSeriesSharedLink)) return false;
    VideoSeriesSharedLink o = (VideoSeriesSharedLink) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(twitter, o.twitter)
        && Internal.equals(facebook, o.facebook)
        && Internal.equals(google, o.google)
        && Internal.equals(line, o.line)
        && Internal.equals(copy, o.copy);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (twitter != null ? twitter.hashCode() : 0);
      result = result * 37 + (facebook != null ? facebook.hashCode() : 0);
      result = result * 37 + (google != null ? google.hashCode() : 0);
      result = result * 37 + (line != null ? line.hashCode() : 0);
      result = result * 37 + (copy != null ? copy.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (twitter != null) builder.append(", twitter=").append(twitter);
    if (facebook != null) builder.append(", facebook=").append(facebook);
    if (google != null) builder.append(", google=").append(google);
    if (line != null) builder.append(", line=").append(line);
    if (copy != null) builder.append(", copy=").append(copy);
    return builder.replace(0, 2, "VideoSeriesSharedLink{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<VideoSeriesSharedLink, Builder> {
    public String twitter;

    public String facebook;

    public String google;

    public String line;

    public String copy;

    public Builder() {
    }

    /**
     * / Twitter
     */
    public Builder twitter(String twitter) {
      this.twitter = twitter;
      return this;
    }

    /**
     * / Facebook
     */
    public Builder facebook(String facebook) {
      this.facebook = facebook;
      return this;
    }

    /**
     * / Google+
     */
    public Builder google(String google) {
      this.google = google;
      return this;
    }

    /**
     * / Line
     */
    public Builder line(String line) {
      this.line = line;
      return this;
    }

    /**
     * / リンクをコピー
     */
    public Builder copy(String copy) {
      this.copy = copy;
      return this;
    }

    @Override
    public VideoSeriesSharedLink build() {
      return new VideoSeriesSharedLink(twitter, facebook, google, line, copy, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_VideoSeriesSharedLink extends ProtoAdapter<VideoSeriesSharedLink> {
    ProtoAdapter_VideoSeriesSharedLink() {
      super(FieldEncoding.LENGTH_DELIMITED, VideoSeriesSharedLink.class);
    }

    @Override
    public int encodedSize(VideoSeriesSharedLink value) {
      return (value.twitter != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.twitter) : 0)
          + (value.facebook != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.facebook) : 0)
          + (value.google != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.google) : 0)
          + (value.line != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.line) : 0)
          + (value.copy != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.copy) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, VideoSeriesSharedLink value) throws IOException {
      if (value.twitter != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.twitter);
      if (value.facebook != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.facebook);
      if (value.google != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.google);
      if (value.line != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.line);
      if (value.copy != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.copy);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public VideoSeriesSharedLink decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.twitter(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.facebook(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.google(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.line(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.copy(ProtoAdapter.STRING.decode(reader)); break;
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
    public VideoSeriesSharedLink redact(VideoSeriesSharedLink value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
