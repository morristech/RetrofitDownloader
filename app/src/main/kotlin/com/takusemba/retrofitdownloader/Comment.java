// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/comment.proto at 12:1
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
import okio.ByteString;

/**
 * / Comment represents a comment.
 */
public final class Comment extends Message<Comment, Comment.Builder> {
  public static final ProtoAdapter<Comment> ADAPTER = new ProtoAdapter_Comment();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ID = "";

  public static final String DEFAULT_MESSAGE = "";

  public static final Long DEFAULT_CREATEDATMS = 0L;

  public static final String DEFAULT_USERID = "";

  /**
   * / Comment id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String id;

  /**
   * / Message
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String message;

  /**
   * / Created at (unix time in milliseconds)
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long createdAtMs;

  /**
   * / ID of user who post
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String userId;

  public Comment(String id, String message, Long createdAtMs, String userId) {
    this(id, message, createdAtMs, userId, ByteString.EMPTY);
  }

  public Comment(String id, String message, Long createdAtMs, String userId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.message = message;
    this.createdAtMs = createdAtMs;
    this.userId = userId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.message = message;
    builder.createdAtMs = createdAtMs;
    builder.userId = userId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Comment)) return false;
    Comment o = (Comment) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(message, o.message)
        && Internal.equals(createdAtMs, o.createdAtMs)
        && Internal.equals(userId, o.userId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (message != null ? message.hashCode() : 0);
      result = result * 37 + (createdAtMs != null ? createdAtMs.hashCode() : 0);
      result = result * 37 + (userId != null ? userId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (message != null) builder.append(", message=").append(message);
    if (createdAtMs != null) builder.append(", createdAtMs=").append(createdAtMs);
    if (userId != null) builder.append(", userId=").append(userId);
    return builder.replace(0, 2, "Comment{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Comment, Builder> {
    public String id;

    public String message;

    public Long createdAtMs;

    public String userId;

    public Builder() {
    }

    /**
     * / Comment id
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * / Message
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * / Created at (unix time in milliseconds)
     */
    public Builder createdAtMs(Long createdAtMs) {
      this.createdAtMs = createdAtMs;
      return this;
    }

    /**
     * / ID of user who post
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    @Override
    public Comment build() {
      return new Comment(id, message, createdAtMs, userId, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Comment extends ProtoAdapter<Comment> {
    ProtoAdapter_Comment() {
      super(FieldEncoding.LENGTH_DELIMITED, Comment.class);
    }

    @Override
    public int encodedSize(Comment value) {
      return (value.id != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.id) : 0)
          + (value.message != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.message) : 0)
          + (value.createdAtMs != null ? ProtoAdapter.INT64.encodedSizeWithTag(3, value.createdAtMs) : 0)
          + (value.userId != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.userId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Comment value) throws IOException {
      if (value.id != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
      if (value.message != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.message);
      if (value.createdAtMs != null) ProtoAdapter.INT64.encodeWithTag(writer, 3, value.createdAtMs);
      if (value.userId != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.userId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Comment decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.message(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.createdAtMs(ProtoAdapter.INT64.decode(reader)); break;
          case 4: builder.userId(ProtoAdapter.STRING.decode(reader)); break;
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
    public Comment redact(Comment value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
