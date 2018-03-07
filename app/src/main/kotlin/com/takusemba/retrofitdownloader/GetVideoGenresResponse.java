// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video.proto at 126:1
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
 * / ビデオジャンル情報の取得レスポンス
 */
public final class GetVideoGenresResponse extends Message<GetVideoGenresResponse, GetVideoGenresResponse.Builder> {
  public static final ProtoAdapter<GetVideoGenresResponse> ADAPTER = new ProtoAdapter_GetVideoGenresResponse();

  private static final long serialVersionUID = 0L;

  /**
   * / VideoGenre slice
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.VideoGenre#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<VideoGenre> genres;

  public GetVideoGenresResponse(List<VideoGenre> genres) {
    this(genres, ByteString.EMPTY);
  }

  public GetVideoGenresResponse(List<VideoGenre> genres, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.genres = Internal.immutableCopyOf("genres", genres);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.genres = Internal.copyOf("genres", genres);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetVideoGenresResponse)) return false;
    GetVideoGenresResponse o = (GetVideoGenresResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(genres, o.genres);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (genres != null ? genres.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (genres != null) builder.append(", genres=").append(genres);
    return builder.replace(0, 2, "GetVideoGenresResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetVideoGenresResponse, Builder> {
    public List<VideoGenre> genres;

    public Builder() {
      genres = Internal.newMutableList();
    }

    /**
     * / VideoGenre slice
     */
    public Builder genres(List<VideoGenre> genres) {
      Internal.checkElementsNotNull(genres);
      this.genres = genres;
      return this;
    }

    @Override
    public GetVideoGenresResponse build() {
      return new GetVideoGenresResponse(genres, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetVideoGenresResponse extends ProtoAdapter<GetVideoGenresResponse> {
    ProtoAdapter_GetVideoGenresResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetVideoGenresResponse.class);
    }

    @Override
    public int encodedSize(GetVideoGenresResponse value) {
      return VideoGenre.ADAPTER.asRepeated().encodedSizeWithTag(1, value.genres)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetVideoGenresResponse value) throws IOException {
      if (value.genres != null) VideoGenre.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.genres);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetVideoGenresResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.genres.add(VideoGenre.ADAPTER.decode(reader)); break;
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
    public GetVideoGenresResponse redact(GetVideoGenresResponse value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.genres, VideoGenre.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}