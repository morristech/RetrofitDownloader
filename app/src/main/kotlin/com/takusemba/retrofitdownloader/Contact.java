// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/business_contact.proto at 17:1
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
 * / 問い合わせ先の情報
 */
public final class Contact extends Message<Contact, Contact.Builder> {
  public static final ProtoAdapter<Contact> ADAPTER = new ProtoAdapter_Contact();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_TITLE = "";

  public static final String DEFAULT_EMAIL = "";

  /**
   * / タイトル
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String title;

  /**
   * / メールアドレス
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String email;

  public Contact(String title, String email) {
    this(title, email, ByteString.EMPTY);
  }

  public Contact(String title, String email, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.title = title;
    this.email = email;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.title = title;
    builder.email = email;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Contact)) return false;
    Contact o = (Contact) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(title, o.title)
        && Internal.equals(email, o.email);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (title != null ? title.hashCode() : 0);
      result = result * 37 + (email != null ? email.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (title != null) builder.append(", title=").append(title);
    if (email != null) builder.append(", email=").append(email);
    return builder.replace(0, 2, "Contact{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Contact, Builder> {
    public String title;

    public String email;

    public Builder() {
    }

    /**
     * / タイトル
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * / メールアドレス
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    @Override
    public Contact build() {
      return new Contact(title, email, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Contact extends ProtoAdapter<Contact> {
    ProtoAdapter_Contact() {
      super(FieldEncoding.LENGTH_DELIMITED, Contact.class);
    }

    @Override
    public int encodedSize(Contact value) {
      return (value.title != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.title) : 0)
          + (value.email != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.email) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Contact value) throws IOException {
      if (value.title != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
      if (value.email != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.email);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Contact decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.title(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.email(ProtoAdapter.STRING.decode(reader)); break;
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
    public Contact redact(Contact value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
