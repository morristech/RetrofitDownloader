// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/track.proto at 18:1
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

public final class Mine extends Message<Mine, Mine.Builder> {
  public static final ProtoAdapter<Mine> ADAPTER = new ProtoAdapter_Mine();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_TIME = "";

  public static final MineSchema DEFAULT_SCHEMA = MineSchema.v1_0_0;

  public static final MineActionType DEFAULT_ACTIONTYPE = MineActionType.end_program;

  public static final MinePlatForm DEFAULT_PLATFORM = MinePlatForm.web;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String time;

  @WireField(
      tag = 2,
      adapter = "tv.abema.protos.MineSchema#ADAPTER"
  )
  public final MineSchema schema;

  @WireField(
      tag = 3,
      adapter = "tv.abema.protos.MineActionType#ADAPTER"
  )
  public final MineActionType actionType;

  @WireField(
      tag = 4,
      adapter = "tv.abema.protos.MinePlatForm#ADAPTER"
  )
  public final MinePlatForm platform;

  @WireField(
      tag = 5,
      adapter = "tv.abema.protos.MineClient#ADAPTER"
  )
  public final MineClient client;

  @WireField(
      tag = 6,
      adapter = "tv.abema.protos.MineUser#ADAPTER"
  )
  public final MineUser user;

  @WireField(
      tag = 7,
      adapter = "tv.abema.protos.MinePage#ADAPTER"
  )
  public final MinePage page;

  @WireField(
      tag = 8,
      adapter = "tv.abema.protos.MineContents#ADAPTER"
  )
  public final MineContents contents;

  public Mine(String time, MineSchema schema, MineActionType actionType, MinePlatForm platform, MineClient client, MineUser user, MinePage page, MineContents contents) {
    this(time, schema, actionType, platform, client, user, page, contents, ByteString.EMPTY);
  }

  public Mine(String time, MineSchema schema, MineActionType actionType, MinePlatForm platform, MineClient client, MineUser user, MinePage page, MineContents contents, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.time = time;
    this.schema = schema;
    this.actionType = actionType;
    this.platform = platform;
    this.client = client;
    this.user = user;
    this.page = page;
    this.contents = contents;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.time = time;
    builder.schema = schema;
    builder.actionType = actionType;
    builder.platform = platform;
    builder.client = client;
    builder.user = user;
    builder.page = page;
    builder.contents = contents;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Mine)) return false;
    Mine o = (Mine) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(time, o.time)
        && Internal.equals(schema, o.schema)
        && Internal.equals(actionType, o.actionType)
        && Internal.equals(platform, o.platform)
        && Internal.equals(client, o.client)
        && Internal.equals(user, o.user)
        && Internal.equals(page, o.page)
        && Internal.equals(contents, o.contents);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (time != null ? time.hashCode() : 0);
      result = result * 37 + (schema != null ? schema.hashCode() : 0);
      result = result * 37 + (actionType != null ? actionType.hashCode() : 0);
      result = result * 37 + (platform != null ? platform.hashCode() : 0);
      result = result * 37 + (client != null ? client.hashCode() : 0);
      result = result * 37 + (user != null ? user.hashCode() : 0);
      result = result * 37 + (page != null ? page.hashCode() : 0);
      result = result * 37 + (contents != null ? contents.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (time != null) builder.append(", time=").append(time);
    if (schema != null) builder.append(", schema=").append(schema);
    if (actionType != null) builder.append(", actionType=").append(actionType);
    if (platform != null) builder.append(", platform=").append(platform);
    if (client != null) builder.append(", client=").append(client);
    if (user != null) builder.append(", user=").append(user);
    if (page != null) builder.append(", page=").append(page);
    if (contents != null) builder.append(", contents=").append(contents);
    return builder.replace(0, 2, "Mine{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Mine, Builder> {
    public String time;

    public MineSchema schema;

    public MineActionType actionType;

    public MinePlatForm platform;

    public MineClient client;

    public MineUser user;

    public MinePage page;

    public MineContents contents;

    public Builder() {
    }

    public Builder time(String time) {
      this.time = time;
      return this;
    }

    public Builder schema(MineSchema schema) {
      this.schema = schema;
      return this;
    }

    public Builder actionType(MineActionType actionType) {
      this.actionType = actionType;
      return this;
    }

    public Builder platform(MinePlatForm platform) {
      this.platform = platform;
      return this;
    }

    public Builder client(MineClient client) {
      this.client = client;
      return this;
    }

    public Builder user(MineUser user) {
      this.user = user;
      return this;
    }

    public Builder page(MinePage page) {
      this.page = page;
      return this;
    }

    public Builder contents(MineContents contents) {
      this.contents = contents;
      return this;
    }

    @Override
    public Mine build() {
      return new Mine(time, schema, actionType, platform, client, user, page, contents, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Mine extends ProtoAdapter<Mine> {
    ProtoAdapter_Mine() {
      super(FieldEncoding.LENGTH_DELIMITED, Mine.class);
    }

    @Override
    public int encodedSize(Mine value) {
      return (value.time != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.time) : 0)
          + (value.schema != null ? MineSchema.ADAPTER.encodedSizeWithTag(2, value.schema) : 0)
          + (value.actionType != null ? MineActionType.ADAPTER.encodedSizeWithTag(3, value.actionType) : 0)
          + (value.platform != null ? MinePlatForm.ADAPTER.encodedSizeWithTag(4, value.platform) : 0)
          + (value.client != null ? MineClient.ADAPTER.encodedSizeWithTag(5, value.client) : 0)
          + (value.user != null ? MineUser.ADAPTER.encodedSizeWithTag(6, value.user) : 0)
          + (value.page != null ? MinePage.ADAPTER.encodedSizeWithTag(7, value.page) : 0)
          + (value.contents != null ? MineContents.ADAPTER.encodedSizeWithTag(8, value.contents) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Mine value) throws IOException {
      if (value.time != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.time);
      if (value.schema != null) MineSchema.ADAPTER.encodeWithTag(writer, 2, value.schema);
      if (value.actionType != null) MineActionType.ADAPTER.encodeWithTag(writer, 3, value.actionType);
      if (value.platform != null) MinePlatForm.ADAPTER.encodeWithTag(writer, 4, value.platform);
      if (value.client != null) MineClient.ADAPTER.encodeWithTag(writer, 5, value.client);
      if (value.user != null) MineUser.ADAPTER.encodeWithTag(writer, 6, value.user);
      if (value.page != null) MinePage.ADAPTER.encodeWithTag(writer, 7, value.page);
      if (value.contents != null) MineContents.ADAPTER.encodeWithTag(writer, 8, value.contents);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Mine decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.time(ProtoAdapter.STRING.decode(reader)); break;
          case 2: {
            try {
              builder.schema(MineSchema.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 3: {
            try {
              builder.actionType(MineActionType.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 4: {
            try {
              builder.platform(MinePlatForm.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 5: builder.client(MineClient.ADAPTER.decode(reader)); break;
          case 6: builder.user(MineUser.ADAPTER.decode(reader)); break;
          case 7: builder.page(MinePage.ADAPTER.decode(reader)); break;
          case 8: builder.contents(MineContents.ADAPTER.decode(reader)); break;
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
    public Mine redact(Mine value) {
      Builder builder = value.newBuilder();
      if (builder.client != null) builder.client = MineClient.ADAPTER.redact(builder.client);
      if (builder.user != null) builder.user = MineUser.ADAPTER.redact(builder.user);
      if (builder.page != null) builder.page = MinePage.ADAPTER.redact(builder.page);
      if (builder.contents != null) builder.contents = MineContents.ADAPTER.redact(builder.contents);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
