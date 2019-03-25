package com.geekbrains.artur.cloud.server;

import io.netty.channel.ChannelHandlerContext;

public interface Server {
    void channelRead(ChannelHandlerContext ctx, Object msg);

    void channelReadComplete(ChannelHandlerContext ctx);
}
