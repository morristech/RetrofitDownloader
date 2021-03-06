// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video_feature.proto at 80:1
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
 * / ビデオTOPのジャンル特集枠一覧取得レスポンス (ジャンルビルボードが設定されていなければ、人気一覧が返される)
 */
public final class GetVideoFeatureGenresResponse extends Message<GetVideoFeatureGenresResponse, GetVideoFeatureGenresResponse.Builder> {
  public static final ProtoAdapter<GetVideoFeatureGenresResponse> ADAPTER = new ProtoAdapter_GetVideoFeatureGenresResponse();

  private static final long serialVersionUID = 0L;

  /**
   * / ビデオジャンル特集枠一覧
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.VideoFeatureGenre#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<VideoFeatureGenre> featureGenres;

  public GetVideoFeatureGenresResponse(List<VideoFeatureGenre> featureGenres) {
    this(featureGenres, ByteString.EMPTY);
  }

  public GetVideoFeatureGenresResponse(List<VideoFeatureGenre> featureGenres, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.featureGenres = Internal.immutableCopyOf("featureGenres", featureGenres);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.featureGenres = Internal.copyOf("featureGenres", featureGenres);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetVideoFeatureGenresResponse)) return false;
    GetVideoFeatureGenresResponse o = (GetVideoFeatureGenresResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(featureGenres, o.featureGenres);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (featureGenres != null ? featureGenres.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (featureGenres != null) builder.append(", featureGenres=").append(featureGenres);
    return builder.replace(0, 2, "GetVideoFeatureGenresResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetVideoFeatureGenresResponse, Builder> {
    public List<VideoFeatureGenre> featureGenres;

    public Builder() {
      featureGenres = Internal.newMutableList();
    }

    /**
     * / ビデオジャンル特集枠一覧
     */
    public Builder featureGenres(List<VideoFeatureGenre> featureGenres) {
      Internal.checkElementsNotNull(featureGenres);
      this.featureGenres = featureGenres;
      return this;
    }

    @Override
    public GetVideoFeatureGenresResponse build() {
      return new GetVideoFeatureGenresResponse(featureGenres, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetVideoFeatureGenresResponse extends ProtoAdapter<GetVideoFeatureGenresResponse> {
    ProtoAdapter_GetVideoFeatureGenresResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetVideoFeatureGenresResponse.class);
    }

    @Override
    public int encodedSize(GetVideoFeatureGenresResponse value) {
      return VideoFeatureGenre.ADAPTER.asRepeated().encodedSizeWithTag(1, value.featureGenres)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetVideoFeatureGenresResponse value) throws IOException {
      if (value.featureGenres != null) VideoFeatureGenre.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.featureGenres);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetVideoFeatureGenresResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.featureGenres.add(VideoFeatureGenre.ADAPTER.decode(reader)); break;
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
    public GetVideoFeatureGenresResponse redact(GetVideoFeatureGenresResponse value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.featureGenres, VideoFeatureGenre.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
