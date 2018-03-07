// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/user.proto at 239:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * / デバイス毎の通知受信設取得
 */
public final class GetDeviceNotificationSettingResponse extends Message<GetDeviceNotificationSettingResponse, GetDeviceNotificationSettingResponse.Builder> {
  public static final ProtoAdapter<GetDeviceNotificationSettingResponse> ADAPTER = new ProtoAdapter_GetDeviceNotificationSettingResponse();

  private static final long serialVersionUID = 0L;

  public static final Boolean DEFAULT_RECOMMENDATION = false;

  /**
   * / 許可するかどうか
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean recommendation;

  public GetDeviceNotificationSettingResponse(Boolean recommendation) {
    this(recommendation, ByteString.EMPTY);
  }

  public GetDeviceNotificationSettingResponse(Boolean recommendation, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.recommendation = recommendation;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.recommendation = recommendation;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetDeviceNotificationSettingResponse)) return false;
    GetDeviceNotificationSettingResponse o = (GetDeviceNotificationSettingResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(recommendation, o.recommendation);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (recommendation != null ? recommendation.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (recommendation != null) builder.append(", recommendation=").append(recommendation);
    return builder.replace(0, 2, "GetDeviceNotificationSettingResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetDeviceNotificationSettingResponse, Builder> {
    public Boolean recommendation;

    public Builder() {
    }

    /**
     * / 許可するかどうか
     */
    public Builder recommendation(Boolean recommendation) {
      this.recommendation = recommendation;
      return this;
    }

    @Override
    public GetDeviceNotificationSettingResponse build() {
      return new GetDeviceNotificationSettingResponse(recommendation, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetDeviceNotificationSettingResponse extends ProtoAdapter<GetDeviceNotificationSettingResponse> {
    ProtoAdapter_GetDeviceNotificationSettingResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetDeviceNotificationSettingResponse.class);
    }

    @Override
    public int encodedSize(GetDeviceNotificationSettingResponse value) {
      return (value.recommendation != null ? ProtoAdapter.BOOL.encodedSizeWithTag(1, value.recommendation) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetDeviceNotificationSettingResponse value) throws IOException {
      if (value.recommendation != null) ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.recommendation);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetDeviceNotificationSettingResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.recommendation(ProtoAdapter.BOOL.decode(reader)); break;
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
    public GetDeviceNotificationSettingResponse redact(GetDeviceNotificationSettingResponse value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
