// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/broadcast_slots.proto at 102:1
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

public final class GetBroadcastSlotStatsResponse extends Message<GetBroadcastSlotStatsResponse, GetBroadcastSlotStatsResponse.Builder> {
  public static final ProtoAdapter<GetBroadcastSlotStatsResponse> ADAPTER = new ProtoAdapter_GetBroadcastSlotStatsResponse();

  private static final long serialVersionUID = 0L;

  /**
   * / 放送中の放送枠の視聴数やコメント数など
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.BroadcastSlotStats#ADAPTER"
  )
  public final BroadcastSlotStats stats;

  public GetBroadcastSlotStatsResponse(BroadcastSlotStats stats) {
    this(stats, ByteString.EMPTY);
  }

  public GetBroadcastSlotStatsResponse(BroadcastSlotStats stats, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.stats = stats;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.stats = stats;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetBroadcastSlotStatsResponse)) return false;
    GetBroadcastSlotStatsResponse o = (GetBroadcastSlotStatsResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(stats, o.stats);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (stats != null ? stats.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (stats != null) builder.append(", stats=").append(stats);
    return builder.replace(0, 2, "GetBroadcastSlotStatsResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetBroadcastSlotStatsResponse, Builder> {
    public BroadcastSlotStats stats;

    public Builder() {
    }

    /**
     * / 放送中の放送枠の視聴数やコメント数など
     */
    public Builder stats(BroadcastSlotStats stats) {
      this.stats = stats;
      return this;
    }

    @Override
    public GetBroadcastSlotStatsResponse build() {
      return new GetBroadcastSlotStatsResponse(stats, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetBroadcastSlotStatsResponse extends ProtoAdapter<GetBroadcastSlotStatsResponse> {
    ProtoAdapter_GetBroadcastSlotStatsResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetBroadcastSlotStatsResponse.class);
    }

    @Override
    public int encodedSize(GetBroadcastSlotStatsResponse value) {
      return (value.stats != null ? BroadcastSlotStats.ADAPTER.encodedSizeWithTag(1, value.stats) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetBroadcastSlotStatsResponse value) throws IOException {
      if (value.stats != null) BroadcastSlotStats.ADAPTER.encodeWithTag(writer, 1, value.stats);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetBroadcastSlotStatsResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.stats(BroadcastSlotStats.ADAPTER.decode(reader)); break;
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
    public GetBroadcastSlotStatsResponse redact(GetBroadcastSlotStatsResponse value) {
      Builder builder = value.newBuilder();
      if (builder.stats != null) builder.stats = BroadcastSlotStats.ADAPTER.redact(builder.stats);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}