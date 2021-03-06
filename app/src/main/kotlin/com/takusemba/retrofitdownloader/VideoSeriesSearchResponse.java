// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/search.proto at 36:1
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
 * / VideoSeriesSearchResponse represents a response of getting search result of video series.
 */
public final class VideoSeriesSearchResponse extends Message<VideoSeriesSearchResponse, VideoSeriesSearchResponse.Builder> {
  public static final ProtoAdapter<VideoSeriesSearchResponse> ADAPTER = new ProtoAdapter_VideoSeriesSearchResponse();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_COUNT = 0L;

  /**
   * series
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.VideoSeries#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<VideoSeries> series;

  /**
   * / Total count
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long count;

  public VideoSeriesSearchResponse(List<VideoSeries> series, Long count) {
    this(series, count, ByteString.EMPTY);
  }

  public VideoSeriesSearchResponse(List<VideoSeries> series, Long count, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.series = Internal.immutableCopyOf("series", series);
    this.count = count;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.series = Internal.copyOf("series", series);
    builder.count = count;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VideoSeriesSearchResponse)) return false;
    VideoSeriesSearchResponse o = (VideoSeriesSearchResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(series, o.series)
        && Internal.equals(count, o.count);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (series != null ? series.hashCode() : 1);
      result = result * 37 + (count != null ? count.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (series != null) builder.append(", series=").append(series);
    if (count != null) builder.append(", count=").append(count);
    return builder.replace(0, 2, "VideoSeriesSearchResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<VideoSeriesSearchResponse, Builder> {
    public List<VideoSeries> series;

    public Long count;

    public Builder() {
      series = Internal.newMutableList();
    }

    /**
     * series
     */
    public Builder series(List<VideoSeries> series) {
      Internal.checkElementsNotNull(series);
      this.series = series;
      return this;
    }

    /**
     * / Total count
     */
    public Builder count(Long count) {
      this.count = count;
      return this;
    }

    @Override
    public VideoSeriesSearchResponse build() {
      return new VideoSeriesSearchResponse(series, count, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_VideoSeriesSearchResponse extends ProtoAdapter<VideoSeriesSearchResponse> {
    ProtoAdapter_VideoSeriesSearchResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, VideoSeriesSearchResponse.class);
    }

    @Override
    public int encodedSize(VideoSeriesSearchResponse value) {
      return VideoSeries.ADAPTER.asRepeated().encodedSizeWithTag(1, value.series)
          + (value.count != null ? ProtoAdapter.INT64.encodedSizeWithTag(2, value.count) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, VideoSeriesSearchResponse value) throws IOException {
      if (value.series != null) VideoSeries.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.series);
      if (value.count != null) ProtoAdapter.INT64.encodeWithTag(writer, 2, value.count);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public VideoSeriesSearchResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.series.add(VideoSeries.ADAPTER.decode(reader)); break;
          case 2: builder.count(ProtoAdapter.INT64.decode(reader)); break;
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
    public VideoSeriesSearchResponse redact(VideoSeriesSearchResponse value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.series, VideoSeries.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
