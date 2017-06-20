package org.swellrt.beta.client;

import org.swellrt.beta.client.wave.WaveWebSocketClient;

import jsinterop.annotations.JsType;

@JsType(namespace = "swell", name = "Constants")
public class ServiceConstants {

  public static final String ANONYMOUS_USER_ID  = "_anonymous_";

  public static final String STATUS_CONNECTED = WaveWebSocketClient.ConnectState.CONNECTED.toString();
  public static final String STATUS_DISCONNECTED = WaveWebSocketClient.ConnectState.DISCONNECTED.toString();
  public static final String STATUS_ERROR = WaveWebSocketClient.ConnectState.ERROR.toString();
  public static final String STATUS_CONNECTING = WaveWebSocketClient.ConnectState.CONNECTING.toString();
  public static final String STATUS_TURBULENCE = WaveWebSocketClient.ConnectState.TURBULENCE
      .toString();
  
}
