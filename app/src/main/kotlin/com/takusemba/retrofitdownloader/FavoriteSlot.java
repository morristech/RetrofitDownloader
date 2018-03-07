// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/favorite.proto at 12:1
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
 * / FavoriteSlot represents a favorite slot.
 */
public final class FavoriteSlot extends Message<FavoriteSlot, FavoriteSlot.Builder> {
  public static final ProtoAdapter<FavoriteSlot> ADAPTER = new ProtoAdapter_FavoriteSlot();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ID = "";

  public static final Boolean DEFAULT_DELETED = false;

  /**
   * / Slot id.
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String id;

  /**
   * / Deleted.
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean deleted;

  public FavoriteSlot(String id, Boolean deleted) {
    this(id, deleted, ByteString.EMPTY);
  }

  public FavoriteSlot(String id, Boolean deleted, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.deleted = deleted;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.deleted = deleted;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FavoriteSlot)) return false;
    FavoriteSlot o = (FavoriteSlot) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(deleted, o.deleted);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (deleted != null ? deleted.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (deleted != null) builder.append(", deleted=").append(deleted);
    return builder.replace(0, 2, "FavoriteSlot{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<FavoriteSlot, Builder> {
    public String id;

    public Boolean deleted;

    public Builder() {
    }

    /**
     * / Slot id.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * / Deleted.
     */
    public Builder deleted(Boolean deleted) {
      this.deleted = deleted;
      return this;
    }

    @Override
    public FavoriteSlot build() {
      return new FavoriteSlot(id, deleted, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_FavoriteSlot extends ProtoAdapter<FavoriteSlot> {
    ProtoAdapter_FavoriteSlot() {
      super(FieldEncoding.LENGTH_DELIMITED, FavoriteSlot.class);
    }

    @Override
    public int encodedSize(FavoriteSlot value) {
      return (value.id != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.id) : 0)
          + (value.deleted != null ? ProtoAdapter.BOOL.encodedSizeWithTag(2, value.deleted) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, FavoriteSlot value) throws IOException {
      if (value.id != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
      if (value.deleted != null) ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.deleted);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public FavoriteSlot decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.deleted(ProtoAdapter.BOOL.decode(reader)); break;
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
    public FavoriteSlot redact(FavoriteSlot value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
