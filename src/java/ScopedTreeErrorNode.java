import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

public class ScopedTreeErrorNode extends ScopedTree {

	public ScopedTreeErrorNode(TokenStream input, Token start, Token stop,
			RecognitionException e) {
		super(start); // no need to record anything for this example
	}

}
