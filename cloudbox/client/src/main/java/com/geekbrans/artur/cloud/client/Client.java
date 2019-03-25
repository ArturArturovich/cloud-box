package com.geekbrans.artur.cloud.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;

public abstract class Client extends ChannelOutboundHandlerAdapter {
    public abstract void channelActive(ChannelHandlerContext ctx);

    public abstract void channelRead(ChannelHandlerContext ctx, Object msg);

    public abstract void channelReadComplete(ChannelHandlerContext ctx);
}
