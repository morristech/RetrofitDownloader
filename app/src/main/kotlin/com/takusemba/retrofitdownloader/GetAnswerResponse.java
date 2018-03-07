// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/question.proto at 60:1
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
 * / 回答済内容取得 response
 */
public final class GetAnswerResponse extends Message<GetAnswerResponse, GetAnswerResponse.Builder> {
  public static final ProtoAdapter<GetAnswerResponse> ADAPTER = new ProtoAdapter_GetAnswerResponse();

  private static final long serialVersionUID = 0L;

  /**
   * / 回答
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.Answer#ADAPTER"
  )
  public final Answer answer;

  public GetAnswerResponse(Answer answer) {
    this(answer, ByteString.EMPTY);
  }

  public GetAnswerResponse(Answer answer, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.answer = answer;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.answer = answer;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetAnswerResponse)) return false;
    GetAnswerResponse o = (GetAnswerResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(answer, o.answer);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (answer != null ? answer.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (answer != null) builder.append(", answer=").append(answer);
    return builder.replace(0, 2, "GetAnswerResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetAnswerResponse, Builder> {
    public Answer answer;

    public Builder() {
    }

    /**
     * / 回答
     */
    public Builder answer(Answer answer) {
      this.answer = answer;
      return this;
    }

    @Override
    public GetAnswerResponse build() {
      return new GetAnswerResponse(answer, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetAnswerResponse extends ProtoAdapter<GetAnswerResponse> {
    ProtoAdapter_GetAnswerResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetAnswerResponse.class);
    }

    @Override
    public int encodedSize(GetAnswerResponse value) {
      return (value.answer != null ? Answer.ADAPTER.encodedSizeWithTag(1, value.answer) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetAnswerResponse value) throws IOException {
      if (value.answer != null) Answer.ADAPTER.encodeWithTag(writer, 1, value.answer);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetAnswerResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.answer(Answer.ADAPTER.decode(reader)); break;
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
    public GetAnswerResponse redact(GetAnswerResponse value) {
      Builder builder = value.newBuilder();
      if (builder.answer != null) builder.answer = Answer.ADAPTER.redact(builder.answer);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}