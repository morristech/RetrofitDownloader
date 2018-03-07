// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/track.proto at 29:1
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

public final class MineClient extends Message<MineClient, MineClient.Builder> {
  public static final ProtoAdapter<MineClient> ADAPTER = new ProtoAdapter_MineClient();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_DEVICEMODEL = "";

  public static final String DEFAULT_ADID = "";

  public static final String DEFAULT_SESSIONID = "";

  public static final MineOs DEFAULT_OS = MineOs.iOS;

  public static final String DEFAULT_OSVERSION = "";

  public static final String DEFAULT_USERAGENT = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String deviceModel;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String adId;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String sessionId;

  @WireField(
      tag = 4,
      adapter = "tv.abema.protos.MineOs#ADAPTER"
  )
  public final MineOs os;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String osVersion;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String userAgent;

  public MineClient(String deviceModel, String adId, String sessionId, MineOs os, String osVersion, String userAgent) {
    this(deviceModel, adId, sessionId, os, osVersion, userAgent, ByteString.EMPTY);
  }

  public MineClient(String deviceModel, String adId, String sessionId, MineOs os, String osVersion, String userAgent, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.deviceModel = deviceModel;
    this.adId = adId;
    this.sessionId = sessionId;
    this.os = os;
    this.osVersion = osVersion;
    this.userAgent = userAgent;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.deviceModel = deviceModel;
    builder.adId = adId;
    builder.sessionId = sessionId;
    builder.os = os;
    builder.osVersion = osVersion;
    builder.userAgent = userAgent;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MineClient)) return false;
    MineClient o = (MineClient) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(deviceModel, o.deviceModel)
        && Internal.equals(adId, o.adId)
        && Internal.equals(sessionId, o.sessionId)
        && Internal.equals(os, o.os)
        && Internal.equals(osVersion, o.osVersion)
        && Internal.equals(userAgent, o.userAgent);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (deviceModel != null ? deviceModel.hashCode() : 0);
      result = result * 37 + (adId != null ? adId.hashCode() : 0);
      result = result * 37 + (sessionId != null ? sessionId.hashCode() : 0);
      result = result * 37 + (os != null ? os.hashCode() : 0);
      result = result * 37 + (osVersion != null ? osVersion.hashCode() : 0);
      result = result * 37 + (userAgent != null ? userAgent.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (deviceModel != null) builder.append(", deviceModel=").append(deviceModel);
    if (adId != null) builder.append(", adId=").append(adId);
    if (sessionId != null) builder.append(", sessionId=").append(sessionId);
    if (os != null) builder.append(", os=").append(os);
    if (osVersion != null) builder.append(", osVersion=").append(osVersion);
    if (userAgent != null) builder.append(", userAgent=").append(userAgent);
    return builder.replace(0, 2, "MineClient{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<MineClient, Builder> {
    public String deviceModel;

    public String adId;

    public String sessionId;

    public MineOs os;

    public String osVersion;

    public String userAgent;

    public Builder() {
    }

    public Builder deviceModel(String deviceModel) {
      this.deviceModel = deviceModel;
      return this;
    }

    public Builder adId(String adId) {
      this.adId = adId;
      return this;
    }

    public Builder sessionId(String sessionId) {
      this.sessionId = sessionId;
      return this;
    }

    public Builder os(MineOs os) {
      this.os = os;
      return this;
    }

    public Builder osVersion(String osVersion) {
      this.osVersion = osVersion;
      return this;
    }

    public Builder userAgent(String userAgent) {
      this.userAgent = userAgent;
      return this;
    }

    @Override
    public MineClient build() {
      return new MineClient(deviceModel, adId, sessionId, os, osVersion, userAgent, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_MineClient extends ProtoAdapter<MineClient> {
    ProtoAdapter_MineClient() {
      super(FieldEncoding.LENGTH_DELIMITED, MineClient.class);
    }

    @Override
    public int encodedSize(MineClient value) {
      return (value.deviceModel != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.deviceModel) : 0)
          + (value.adId != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.adId) : 0)
          + (value.sessionId != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.sessionId) : 0)
          + (value.os != null ? MineOs.ADAPTER.encodedSizeWithTag(4, value.os) : 0)
          + (value.osVersion != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.osVersion) : 0)
          + (value.userAgent != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.userAgent) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, MineClient value) throws IOException {
      if (value.deviceModel != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.deviceModel);
      if (value.adId != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.adId);
      if (value.sessionId != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.sessionId);
      if (value.os != null) MineOs.ADAPTER.encodeWithTag(writer, 4, value.os);
      if (value.osVersion != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.osVersion);
      if (value.userAgent != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.userAgent);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public MineClient decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.deviceModel(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.adId(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.sessionId(ProtoAdapter.STRING.decode(reader)); break;
          case 4: {
            try {
              builder.os(MineOs.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 5: builder.osVersion(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.userAgent(ProtoAdapter.STRING.decode(reader)); break;
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
    public MineClient redact(MineClient value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
