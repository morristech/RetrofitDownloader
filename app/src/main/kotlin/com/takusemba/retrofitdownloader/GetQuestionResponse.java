// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/question.proto at 48:1
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
 * / 質問取得 response
 */
public final class GetQuestionResponse extends Message<GetQuestionResponse, GetQuestionResponse.Builder> {
  public static final ProtoAdapter<GetQuestionResponse> ADAPTER = new ProtoAdapter_GetQuestionResponse();

  private static final long serialVersionUID = 0L;

  /**
   * / 質問内容
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.Question#ADAPTER"
  )
  public final Question question;

  /**
   * / 結果
   */
  @WireField(
      tag = 2,
      adapter = "tv.abema.protos.QuestionResult#ADAPTER"
  )
  public final QuestionResult result;

  public GetQuestionResponse(Question question, QuestionResult result) {
    this(question, result, ByteString.EMPTY);
  }

  public GetQuestionResponse(Question question, QuestionResult result, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.question = question;
    this.result = result;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.question = question;
    builder.result = result;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetQuestionResponse)) return false;
    GetQuestionResponse o = (GetQuestionResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(question, o.question)
        && Internal.equals(result, o.result);
  }

  @Override
  public int hashCode() {
    int result_ = super.hashCode;
    if (result_ == 0) {
      result_ = unknownFields().hashCode();
      result_ = result_ * 37 + (question != null ? question.hashCode() : 0);
      result_ = result_ * 37 + (result != null ? result.hashCode() : 0);
      super.hashCode = result_;
    }
    return result_;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (question != null) builder.append(", question=").append(question);
    if (result != null) builder.append(", result=").append(result);
    return builder.replace(0, 2, "GetQuestionResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetQuestionResponse, Builder> {
    public Question question;

    public QuestionResult result;

    public Builder() {
    }

    /**
     * / 質問内容
     */
    public Builder question(Question question) {
      this.question = question;
      return this;
    }

    /**
     * / 結果
     */
    public Builder result(QuestionResult result) {
      this.result = result;
      return this;
    }

    @Override
    public GetQuestionResponse build() {
      return new GetQuestionResponse(question, result, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetQuestionResponse extends ProtoAdapter<GetQuestionResponse> {
    ProtoAdapter_GetQuestionResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetQuestionResponse.class);
    }

    @Override
    public int encodedSize(GetQuestionResponse value) {
      return (value.question != null ? Question.ADAPTER.encodedSizeWithTag(1, value.question) : 0)
          + (value.result != null ? QuestionResult.ADAPTER.encodedSizeWithTag(2, value.result) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetQuestionResponse value) throws IOException {
      if (value.question != null) Question.ADAPTER.encodeWithTag(writer, 1, value.question);
      if (value.result != null) QuestionResult.ADAPTER.encodeWithTag(writer, 2, value.result);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetQuestionResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.question(Question.ADAPTER.decode(reader)); break;
          case 2: builder.result(QuestionResult.ADAPTER.decode(reader)); break;
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
    public GetQuestionResponse redact(GetQuestionResponse value) {
      Builder builder = value.newBuilder();
      if (builder.question != null) builder.question = Question.ADAPTER.redact(builder.question);
      if (builder.result != null) builder.result = QuestionResult.ADAPTER.redact(builder.result);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
