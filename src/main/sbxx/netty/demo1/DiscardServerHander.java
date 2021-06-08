package main.sbxx.netty.demo1;


import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author Dair
 * @since
 */
public class DiscardServerHander extends ChannelInboundHandlerAdapter {
	
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//		ByteBuf msg1 = (ByteBuf) msg;
//		try {
//			while (msg1.isReadable()){
//				System.out.println((char) msg1.readByte());
//				System.out.flush();
//			}
//		}finally {
//			msg1.release();
//		}
		ctx.write(msg);
		ctx.flush();
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();
	}
}
