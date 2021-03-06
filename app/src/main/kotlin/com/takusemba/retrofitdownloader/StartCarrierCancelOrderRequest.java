// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/subscription.proto at 80:1
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
 * / キャリア決済月額課金解約のための注文開始 request
 */
public final class StartCarrierCancelOrderRequest extends Message<StartCarrierCancelOrderRequest, StartCarrierCancelOrderRequest.Builder> {
  public static final ProtoAdapter<StartCarrierCancelOrderRequest> ADAPTER = new ProtoAdapter_StartCarrierCancelOrderRequest();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_RETURL = "";

  /**
   * / 決済結果戻しURL
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String retUrl;

  public StartCarrierCancelOrderRequest(String retUrl) {
    this(retUrl, ByteString.EMPTY);
  }

  public StartCarrierCancelOrderRequest(String retUrl, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.retUrl = retUrl;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.retUrl = retUrl;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof StartCarrierCancelOrderRequest)) return false;
    StartCarrierCancelOrderRequest o = (StartCarrierCancelOrderRequest) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(retUrl, o.retUrl);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (retUrl != null ? retUrl.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (retUrl != null) builder.append(", retUrl=").append(retUrl);
    return builder.replace(0, 2, "StartCarrierCancelOrderRequest{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<StartCarrierCancelOrderRequest, Builder> {
    public String retUrl;

    public Builder() {
    }

    /**
     * / 決済結果戻しURL
     */
    public Builder retUrl(String retUrl) {
      this.retUrl = retUrl;
      return this;
    }

    @Override
    public StartCarrierCancelOrderRequest build() {
      return new StartCarrierCancelOrderRequest(retUrl, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_StartCarrierCancelOrderRequest extends ProtoAdapter<StartCarrierCancelOrderRequest> {
    ProtoAdapter_StartCarrierCancelOrderRequest() {
      super(FieldEncoding.LENGTH_DELIMITED, StartCarrierCancelOrderRequest.class);
    }

    @Override
    public int encodedSize(StartCarrierCancelOrderRequest value) {
      return (value.retUrl != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.retUrl) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, StartCarrierCancelOrderRequest value) throws IOException {
      if (value.retUrl != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.retUrl);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public StartCarrierCancelOrderRequest decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.retUrl(ProtoAdapter.STRING.decode(reader)); break;
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
    public StartCarrierCancelOrderRequest redact(StartCarrierCancelOrderRequest value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
