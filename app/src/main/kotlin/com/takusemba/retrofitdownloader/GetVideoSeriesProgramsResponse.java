// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video.proto at 107:1
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
 * / ビデオシリーズに紐づく番組情報の一覧取得レスポンス
 */
public final class GetVideoSeriesProgramsResponse extends Message<GetVideoSeriesProgramsResponse, GetVideoSeriesProgramsResponse.Builder> {
  public static final ProtoAdapter<GetVideoSeriesProgramsResponse> ADAPTER = new ProtoAdapter_GetVideoSeriesProgramsResponse();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_VERSION = "";

  /**
   * / VideoProgram slice
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.VideoProgram#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<VideoProgram> programs;

  /**
   * / バージョン
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String version;

  public GetVideoSeriesProgramsResponse(List<VideoProgram> programs, String version) {
    this(programs, version, ByteString.EMPTY);
  }

  public GetVideoSeriesProgramsResponse(List<VideoProgram> programs, String version, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.programs = Internal.immutableCopyOf("programs", programs);
    this.version = version;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.programs = Internal.copyOf("programs", programs);
    builder.version = version;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetVideoSeriesProgramsResponse)) return false;
    GetVideoSeriesProgramsResponse o = (GetVideoSeriesProgramsResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(programs, o.programs)
        && Internal.equals(version, o.version);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (programs != null ? programs.hashCode() : 1);
      result = result * 37 + (version != null ? version.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (programs != null) builder.append(", programs=").append(programs);
    if (version != null) builder.append(", version=").append(version);
    return builder.replace(0, 2, "GetVideoSeriesProgramsResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetVideoSeriesProgramsResponse, Builder> {
    public List<VideoProgram> programs;

    public String version;

    public Builder() {
      programs = Internal.newMutableList();
    }

    /**
     * / VideoProgram slice
     */
    public Builder programs(List<VideoProgram> programs) {
      Internal.checkElementsNotNull(programs);
      this.programs = programs;
      return this;
    }

    /**
     * / バージョン
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    @Override
    public GetVideoSeriesProgramsResponse build() {
      return new GetVideoSeriesProgramsResponse(programs, version, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetVideoSeriesProgramsResponse extends ProtoAdapter<GetVideoSeriesProgramsResponse> {
    ProtoAdapter_GetVideoSeriesProgramsResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetVideoSeriesProgramsResponse.class);
    }

    @Override
    public int encodedSize(GetVideoSeriesProgramsResponse value) {
      return VideoProgram.ADAPTER.asRepeated().encodedSizeWithTag(1, value.programs)
          + (value.version != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.version) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetVideoSeriesProgramsResponse value) throws IOException {
      if (value.programs != null) VideoProgram.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.programs);
      if (value.version != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.version);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetVideoSeriesProgramsResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.programs.add(VideoProgram.ADAPTER.decode(reader)); break;
          case 2: builder.version(ProtoAdapter.STRING.decode(reader)); break;
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
    public GetVideoSeriesProgramsResponse redact(GetVideoSeriesProgramsResponse value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.programs, VideoProgram.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
