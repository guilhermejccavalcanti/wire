// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/service_root.proto at 6:1
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.Object;
import java.lang.Override;
import okio.ByteString;

public final class TheResponse extends Message<TheResponse> {
  public static final ProtoAdapter<TheResponse> ADAPTER = ProtoAdapter.newMessageAdapter(TheResponse.class);

  private static final long serialVersionUID = 0L;

  public TheResponse() {
    this(ByteString.EMPTY);
  }

  public TheResponse(ByteString unknownFields) {
    super(unknownFields);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof TheResponse;
  }

  @Override
  public int hashCode() {
    return unknownFields().hashCode();
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<TheResponse, Builder> {
    public Builder() {
    }

    public Builder(TheResponse message) {
      super(message);
    }

    @Override
    public TheResponse build() {
      return new TheResponse(buildUnknownFields());
    }
  }
}
