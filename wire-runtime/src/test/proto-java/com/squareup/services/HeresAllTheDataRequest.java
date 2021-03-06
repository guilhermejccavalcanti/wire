// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/simple_service2.proto at 5:1
package com.squareup.services;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import okio.ByteString;

public final class HeresAllTheDataRequest extends Message<HeresAllTheDataRequest> {
  public static final ProtoAdapter<HeresAllTheDataRequest> ADAPTER = ProtoAdapter.newMessageAdapter(HeresAllTheDataRequest.class);

  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_DATA = ByteString.EMPTY;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString data;

  public HeresAllTheDataRequest(ByteString data) {
    this(data, ByteString.EMPTY);
  }

  public HeresAllTheDataRequest(ByteString data, ByteString unknownFields) {
    super(unknownFields);
    this.data = data;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof HeresAllTheDataRequest)) return false;
    HeresAllTheDataRequest o = (HeresAllTheDataRequest) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(data, o.data);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (data != null ? data.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<HeresAllTheDataRequest, Builder> {
    public ByteString data;

    public Builder() {
    }

    public Builder(HeresAllTheDataRequest message) {
      super(message);
      if (message == null) return;
      this.data = message.data;
    }

    public Builder data(ByteString data) {
      this.data = data;
      return this;
    }

    @Override
    public HeresAllTheDataRequest build() {
      return new HeresAllTheDataRequest(data, buildUnknownFields());
    }
  }
}
