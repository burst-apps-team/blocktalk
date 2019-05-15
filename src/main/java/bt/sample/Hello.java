package bt.sample;

import bt.CompilerVersion;
import bt.Contract;
import bt.TargetCompilerVersion;
import bt.ui.EmulatorWindow;

/**
 * A contract that simply send a "Hello, World" message back.
 * 
 * @author jjos
 *
 */
@TargetCompilerVersion(CompilerVersion.v0_0_0)
public class Hello extends Contract {

	/**
	 * Every time a transaction is sent to the contract, this method is called
	 */
	@Override
	public void txReceived() {
		sendMessage("Hello, World", getCurrentTx().getSenderAddress());
	}

	/**
	 * A main function for debugging purposes only, this method is not
	 * compiled into bytecode.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new EmulatorWindow(Hello.class);
		compile();
	}
}
