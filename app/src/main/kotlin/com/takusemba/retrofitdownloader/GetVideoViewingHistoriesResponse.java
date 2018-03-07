// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video_viewing.proto at 72:1
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
 * / ビデオ視聴履歴一覧取得レスポンス
 */
public final class GetVideoViewingHistoriesResponse extends Message<GetVideoViewingHistoriesResponse, GetVideoViewingHistoriesResponse.Builder> {
  public static final ProtoAdapter<GetVideoViewingHistoriesResponse> ADAPTER = new ProtoAdapter_GetVideoViewingHistoriesResponse();

  private static final long serialVersionUID = 0L;

  /**
   * / 視聴履歴
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.VideoViewingHistory#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<VideoViewingHistory> histories;

  public GetVideoViewingHistoriesResponse(List<VideoViewingHistory> histories) {
    this(histories, ByteString.EMPTY);
  }

  public GetVideoViewingHistoriesResponse(List<VideoViewingHistory> histories, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.histories = Internal.immutableCopyOf("histories", histories);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.histories = Internal.copyOf("histories", histories);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetVideoViewingHistoriesResponse)) return false;
    GetVideoViewingHistoriesResponse o = (GetVideoViewingHistoriesResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(histories, o.histories);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (histories != null ? histories.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (histories != null) builder.append(", histories=").append(histories);
    return builder.replace(0, 2, "GetVideoViewingHistoriesResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetVideoViewingHistoriesResponse, Builder> {
    public List<VideoViewingHistory> histories;

    public Builder() {
      histories = Internal.newMutableList();
    }

    /**
     * / 視聴履歴
     */
    public Builder histories(List<VideoViewingHistory> histories) {
      Internal.checkElementsNotNull(histories);
      this.histories = histories;
      return this;
    }

    @Override
    public GetVideoViewingHistoriesResponse build() {
      return new GetVideoViewingHistoriesResponse(histories, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetVideoViewingHistoriesResponse extends ProtoAdapter<GetVideoViewingHistoriesResponse> {
    ProtoAdapter_GetVideoViewingHistoriesResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetVideoViewingHistoriesResponse.class);
    }

    @Override
    public int encodedSize(GetVideoViewingHistoriesResponse value) {
      return VideoViewingHistory.ADAPTER.asRepeated().encodedSizeWithTag(1, value.histories)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetVideoViewingHistoriesResponse value) throws IOException {
      if (value.histories != null) VideoViewingHistory.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.histories);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetVideoViewingHistoriesResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.histories.add(VideoViewingHistory.ADAPTER.decode(reader)); break;
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
    public GetVideoViewingHistoriesResponse redact(GetVideoViewingHistoriesResponse value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.histories, VideoViewingHistory.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}