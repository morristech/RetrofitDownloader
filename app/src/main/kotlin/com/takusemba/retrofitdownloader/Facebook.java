// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/user.proto at 36:1
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
 * Represents authentication type of facebook
 */
public final class Facebook extends Message<Facebook, Facebook.Builder> {
  public static final ProtoAdapter<Facebook> ADAPTER = new ProtoAdapter_Facebook();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_FACEBOOKUSERID = "";

  public static final String DEFAULT_ACCESSTOKEN = "";

  public static final String DEFAULT_DISPLAYNAME = "";

  public static final String DEFAULT_PROFILEIMAGEURL = "";

  public static final Long DEFAULT_CONNECTEDAT = 0L;

  /**
   * / User ID of Facebook
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String facebookUserId;

  /**
   * / Access token of Facebook
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String accessToken;

  /**
   * / Display name of Facebook
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String displayName;

  /**
   * / Profile image URL of Facebook
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String profileImageUrl;

  /**
   * / Connected at (unix time)
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long connectedAt;

  public Facebook(String facebookUserId, String accessToken, String displayName, String profileImageUrl, Long connectedAt) {
    this(facebookUserId, accessToken, displayName, profileImageUrl, connectedAt, ByteString.EMPTY);
  }

  public Facebook(String facebookUserId, String accessToken, String displayName, String profileImageUrl, Long connectedAt, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.facebookUserId = facebookUserId;
    this.accessToken = accessToken;
    this.displayName = displayName;
    this.profileImageUrl = profileImageUrl;
    this.connectedAt = connectedAt;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.facebookUserId = facebookUserId;
    builder.accessToken = accessToken;
    builder.displayName = displayName;
    builder.profileImageUrl = profileImageUrl;
    builder.connectedAt = connectedAt;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Facebook)) return false;
    Facebook o = (Facebook) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(facebookUserId, o.facebookUserId)
        && Internal.equals(accessToken, o.accessToken)
        && Internal.equals(displayName, o.displayName)
        && Internal.equals(profileImageUrl, o.profileImageUrl)
        && Internal.equals(connectedAt, o.connectedAt);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (facebookUserId != null ? facebookUserId.hashCode() : 0);
      result = result * 37 + (accessToken != null ? accessToken.hashCode() : 0);
      result = result * 37 + (displayName != null ? displayName.hashCode() : 0);
      result = result * 37 + (profileImageUrl != null ? profileImageUrl.hashCode() : 0);
      result = result * 37 + (connectedAt != null ? connectedAt.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (facebookUserId != null) builder.append(", facebookUserId=").append(facebookUserId);
    if (accessToken != null) builder.append(", accessToken=").append(accessToken);
    if (displayName != null) builder.append(", displayName=").append(displayName);
    if (profileImageUrl != null) builder.append(", profileImageUrl=").append(profileImageUrl);
    if (connectedAt != null) builder.append(", connectedAt=").append(connectedAt);
    return builder.replace(0, 2, "Facebook{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Facebook, Builder> {
    public String facebookUserId;

    public String accessToken;

    public String displayName;

    public String profileImageUrl;

    public Long connectedAt;

    public Builder() {
    }

    /**
     * / User ID of Facebook
     */
    public Builder facebookUserId(String facebookUserId) {
      this.facebookUserId = facebookUserId;
      return this;
    }

    /**
     * / Access token of Facebook
     */
    public Builder accessToken(String accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    /**
     * / Display name of Facebook
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * / Profile image URL of Facebook
     */
    public Builder profileImageUrl(String profileImageUrl) {
      this.profileImageUrl = profileImageUrl;
      return this;
    }

    /**
     * / Connected at (unix time)
     */
    public Builder connectedAt(Long connectedAt) {
      this.connectedAt = connectedAt;
      return this;
    }

    @Override
    public Facebook build() {
      return new Facebook(facebookUserId, accessToken, displayName, profileImageUrl, connectedAt, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Facebook extends ProtoAdapter<Facebook> {
    ProtoAdapter_Facebook() {
      super(FieldEncoding.LENGTH_DELIMITED, Facebook.class);
    }

    @Override
    public int encodedSize(Facebook value) {
      return (value.facebookUserId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.facebookUserId) : 0)
          + (value.accessToken != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.accessToken) : 0)
          + (value.displayName != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.displayName) : 0)
          + (value.profileImageUrl != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.profileImageUrl) : 0)
          + (value.connectedAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(5, value.connectedAt) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Facebook value) throws IOException {
      if (value.facebookUserId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.facebookUserId);
      if (value.accessToken != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.accessToken);
      if (value.displayName != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.displayName);
      if (value.profileImageUrl != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.profileImageUrl);
      if (value.connectedAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 5, value.connectedAt);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Facebook decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.facebookUserId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.accessToken(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.displayName(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.profileImageUrl(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.connectedAt(ProtoAdapter.INT64.decode(reader)); break;
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
    public Facebook redact(Facebook value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
