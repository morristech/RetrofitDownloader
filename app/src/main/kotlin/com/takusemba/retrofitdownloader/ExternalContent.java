// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/media.proto at 144:1
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
 * / 外部コンテンツ情報
 */
public final class ExternalContent extends Message<ExternalContent, ExternalContent.Builder> {
  public static final ProtoAdapter<ExternalContent> ADAPTER = new ProtoAdapter_ExternalContent();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_LINKTEXT = "";

  public static final String DEFAULT_LINK = "";

  /**
   * / 外部コンテンツリンクテキスト
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String linkText;

  /**
   * / 外部コンテンツリンク
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String link;

  public ExternalContent(String linkText, String link) {
    this(linkText, link, ByteString.EMPTY);
  }

  public ExternalContent(String linkText, String link, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.linkText = linkText;
    this.link = link;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.linkText = linkText;
    builder.link = link;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ExternalContent)) return false;
    ExternalContent o = (ExternalContent) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(linkText, o.linkText)
        && Internal.equals(link, o.link);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (linkText != null ? linkText.hashCode() : 0);
      result = result * 37 + (link != null ? link.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (linkText != null) builder.append(", linkText=").append(linkText);
    if (link != null) builder.append(", link=").append(link);
    return builder.replace(0, 2, "ExternalContent{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ExternalContent, Builder> {
    public String linkText;

    public String link;

    public Builder() {
    }

    /**
     * / 外部コンテンツリンクテキスト
     */
    public Builder linkText(String linkText) {
      this.linkText = linkText;
      return this;
    }

    /**
     * / 外部コンテンツリンク
     */
    public Builder link(String link) {
      this.link = link;
      return this;
    }

    @Override
    public ExternalContent build() {
      return new ExternalContent(linkText, link, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ExternalContent extends ProtoAdapter<ExternalContent> {
    ProtoAdapter_ExternalContent() {
      super(FieldEncoding.LENGTH_DELIMITED, ExternalContent.class);
    }

    @Override
    public int encodedSize(ExternalContent value) {
      return (value.linkText != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.linkText) : 0)
          + (value.link != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.link) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ExternalContent value) throws IOException {
      if (value.linkText != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.linkText);
      if (value.link != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.link);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ExternalContent decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.linkText(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.link(ProtoAdapter.STRING.decode(reader)); break;
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
    public ExternalContent redact(ExternalContent value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}