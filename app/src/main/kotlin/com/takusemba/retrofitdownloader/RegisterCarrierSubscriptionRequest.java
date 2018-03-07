// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/subscription.proto at 74:1
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
 * / キャリア決済月額課金登録 request
 */
public final class RegisterCarrierSubscriptionRequest extends Message<RegisterCarrierSubscriptionRequest, RegisterCarrierSubscriptionRequest.Builder> {
  public static final ProtoAdapter<RegisterCarrierSubscriptionRequest> ADAPTER = new ProtoAdapter_RegisterCarrierSubscriptionRequest();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final String DEFAULT_TRANSACTIONID = "";

  /**
   * / オーダーID
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * / キャリアが発行する取引ID
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String transactionId;

  public RegisterCarrierSubscriptionRequest(String orderId, String transactionId) {
    this(orderId, transactionId, ByteString.EMPTY);
  }

  public RegisterCarrierSubscriptionRequest(String orderId, String transactionId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.transactionId = transactionId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.transactionId = transactionId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RegisterCarrierSubscriptionRequest)) return false;
    RegisterCarrierSubscriptionRequest o = (RegisterCarrierSubscriptionRequest) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(transactionId, o.transactionId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (transactionId != null ? transactionId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (transactionId != null) builder.append(", transactionId=").append(transactionId);
    return builder.replace(0, 2, "RegisterCarrierSubscriptionRequest{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<RegisterCarrierSubscriptionRequest, Builder> {
    public String orderId;

    public String transactionId;

    public Builder() {
    }

    /**
     * / オーダーID
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * / キャリアが発行する取引ID
     */
    public Builder transactionId(String transactionId) {
      this.transactionId = transactionId;
      return this;
    }

    @Override
    public RegisterCarrierSubscriptionRequest build() {
      return new RegisterCarrierSubscriptionRequest(orderId, transactionId, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_RegisterCarrierSubscriptionRequest extends ProtoAdapter<RegisterCarrierSubscriptionRequest> {
    ProtoAdapter_RegisterCarrierSubscriptionRequest() {
      super(FieldEncoding.LENGTH_DELIMITED, RegisterCarrierSubscriptionRequest.class);
    }

    @Override
    public int encodedSize(RegisterCarrierSubscriptionRequest value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.transactionId != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.transactionId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, RegisterCarrierSubscriptionRequest value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.transactionId != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.transactionId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public RegisterCarrierSubscriptionRequest decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.transactionId(ProtoAdapter.STRING.decode(reader)); break;
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
    public RegisterCarrierSubscriptionRequest redact(RegisterCarrierSubscriptionRequest value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}