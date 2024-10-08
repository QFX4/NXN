// Generated from /home/pochodnicky/wrksp/no-git/NXN/src/g4/Skeleton.g4 by ANTLR 4.13.1
package org.nxn.model.skeleton.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SkeletonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NAME=13, DIGITS=14, WS=15;
	public static final int
		RULE_skeleton = 0, RULE_joint = 1, RULE_axis = 2, RULE_angles = 3, RULE_angle = 4, 
		RULE_jointList = 5, RULE_bindings = 6, RULE_binding = 7, RULE_indList = 8, 
		RULE_vector3 = 9, RULE_floatNum = 10, RULE_intNum = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"skeleton", "joint", "axis", "angles", "angle", "jointList", "bindings", 
			"binding", "indList", "vector3", "floatNum", "intNum"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "':'", "'('", "','", "')'", "'->'", "'+'", "'-'", 
			"'.'", "'e'", "'E'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NAME", "DIGITS", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Skeleton.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SkeletonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SkeletonContext extends ParserRuleContext {
		public org.nxn.model.skeleton.ParsedJoint result;
		public JointContext j;
		public JointContext joint() {
			return getRuleContext(JointContext.class,0);
		}
		public SkeletonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skeleton; }
	}

	public final SkeletonContext skeleton() throws RecognitionException {
		SkeletonContext _localctx = new SkeletonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_skeleton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			((SkeletonContext)_localctx).j = joint();
			setState(26);
			match(T__1);
			 ((SkeletonContext)_localctx).result =  ((SkeletonContext)_localctx).j.r; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JointContext extends ParserRuleContext {
		public org.nxn.model.skeleton.ParsedJoint r;
		public Token nm;
		public Vector3Context v;
		public AxisContext o;
		public AnglesContext a;
		public BindingsContext b;
		public JointListContext l;
		public TerminalNode NAME() { return getToken(SkeletonParser.NAME, 0); }
		public AnglesContext angles() {
			return getRuleContext(AnglesContext.class,0);
		}
		public BindingsContext bindings() {
			return getRuleContext(BindingsContext.class,0);
		}
		public JointListContext jointList() {
			return getRuleContext(JointListContext.class,0);
		}
		public Vector3Context vector3() {
			return getRuleContext(Vector3Context.class,0);
		}
		public AxisContext axis() {
			return getRuleContext(AxisContext.class,0);
		}
		public JointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joint; }
	}

	public final JointContext joint() throws RecognitionException {
		JointContext _localctx = new JointContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_joint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			((JointContext)_localctx).nm = match(NAME);
			setState(30);
			match(T__2);
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				{
				setState(31);
				((JointContext)_localctx).v = vector3();
				setState(32);
				((JointContext)_localctx).o = axis();
				}
				}
				break;
			case 2:
				{
				setState(34);
				((JointContext)_localctx).a = angles();
				}
				break;
			}
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37);
				match(T__2);
				setState(38);
				((JointContext)_localctx).b = bindings();
				}
				break;
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(41);
				match(T__2);
				setState(42);
				((JointContext)_localctx).l = jointList();
				}
			}

			 ((JointContext)_localctx).r =  new org.nxn.model.skeleton.ParsedJoint( (((JointContext)_localctx).nm!=null?((JointContext)_localctx).nm.getText():null), ((JointContext)_localctx).v.r, ((JointContext)_localctx).o.r, ((JointContext)_localctx).a.r, ((JointContext)_localctx).b.r, ((JointContext)_localctx).l.r); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AxisContext extends ParserRuleContext {
		public org.nxn.math.Axis[] r;
		public Token t;
		public TerminalNode NAME() { return getToken(SkeletonParser.NAME, 0); }
		public AxisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axis; }
	}

	public final AxisContext axis() throws RecognitionException {
		AxisContext _localctx = new AxisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_axis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__2);
			setState(48);
			((AxisContext)_localctx).t = match(NAME);
			 ((AxisContext)_localctx).r =  (((AxisContext)_localctx).t!=null?((AxisContext)_localctx).t.getText():null).chars().mapToObj(c -> org.nxn.math.Axis.valueOf(String.valueOf((char)c))).toArray(l -> new org.nxn.math.Axis[l]); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnglesContext extends ParserRuleContext {
		public org.nxn.model.skeleton.ParsedAngle[] r;
		public AngleContext j;
		public AngleContext k;
		public List<AngleContext> angle() {
			return getRuleContexts(AngleContext.class);
		}
		public AngleContext angle(int i) {
			return getRuleContext(AngleContext.class,i);
		}
		public AnglesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angles; }
	}

	public final AnglesContext angles() throws RecognitionException {
		AnglesContext _localctx = new AnglesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_angles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 java.util.List<org.nxn.model.skeleton.ParsedAngle> l = new java.util.ArrayList<org.nxn.model.skeleton.ParsedAngle>(); 
			setState(52);
			match(T__3);
			setState(53);
			((AnglesContext)_localctx).j = angle();
			 l.add(((AnglesContext)_localctx).j.r); 
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(55);
				match(T__4);
				setState(56);
				((AnglesContext)_localctx).k = angle();
				 l.add(((AnglesContext)_localctx).k.r); 
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(T__5);
			 ((AnglesContext)_localctx).r =  l.toArray(new org.nxn.model.skeleton.ParsedAngle[0]); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngleContext extends ParserRuleContext {
		public org.nxn.model.skeleton.ParsedAngle r;
		public FloatNumContext n;
		public Token f;
		public Token t;
		public FloatNumContext floatNum() {
			return getRuleContext(FloatNumContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(SkeletonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SkeletonParser.NAME, i);
		}
		public AngleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angle; }
	}

	public final AngleContext angle() throws RecognitionException {
		AngleContext _localctx = new AngleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_angle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((AngleContext)_localctx).n = floatNum();
			setState(68);
			match(T__2);
			setState(69);
			((AngleContext)_localctx).f = match(NAME);
			setState(70);
			match(T__6);
			setState(71);
			((AngleContext)_localctx).t = match(NAME);
			 ((AngleContext)_localctx).r =  new org.nxn.model.skeleton.ParsedAngle(org.nxn.math.Axis.valueOf((((AngleContext)_localctx).f!=null?((AngleContext)_localctx).f.getText():null)), org.nxn.math.Axis.valueOf((((AngleContext)_localctx).t!=null?((AngleContext)_localctx).t.getText():null)), ((AngleContext)_localctx).n.r); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JointListContext extends ParserRuleContext {
		public org.nxn.model.skeleton.ParsedJoint[] r;
		public JointContext j;
		public JointContext k;
		public List<JointContext> joint() {
			return getRuleContexts(JointContext.class);
		}
		public JointContext joint(int i) {
			return getRuleContext(JointContext.class,i);
		}
		public JointListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jointList; }
	}

	public final JointListContext jointList() throws RecognitionException {
		JointListContext _localctx = new JointListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jointList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 java.util.List<org.nxn.model.skeleton.ParsedJoint> l = new java.util.ArrayList<org.nxn.model.skeleton.ParsedJoint>(); 
			setState(75);
			match(T__0);
			setState(76);
			((JointListContext)_localctx).j = joint();
			 l.add(((JointListContext)_localctx).j.r); 
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(78);
				match(T__4);
				setState(79);
				((JointListContext)_localctx).k = joint();
				 l.add(((JointListContext)_localctx).k.r); 
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(T__1);
			 ((JointListContext)_localctx).r =  l.toArray(new org.nxn.model.skeleton.ParsedJoint[0]); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BindingsContext extends ParserRuleContext {
		public org.nxn.model.skeleton.ParsedBinding[] r;
		public BindingContext n;
		public BindingContext m;
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
		}
		public BindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindings; }
	}

	public final BindingsContext bindings() throws RecognitionException {
		BindingsContext _localctx = new BindingsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bindings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 java.util.List<org.nxn.model.skeleton.ParsedBinding> l = new java.util.ArrayList<org.nxn.model.skeleton.ParsedBinding>(); 
			setState(91);
			match(T__0);
			setState(92);
			((BindingsContext)_localctx).n = binding();
			 l.add(((BindingsContext)_localctx).n.r); 
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(94);
				match(T__4);
				setState(95);
				((BindingsContext)_localctx).m = binding();
				 l.add(((BindingsContext)_localctx).m.r); 
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(T__1);
			 ((BindingsContext)_localctx).r =  l.toArray( new org.nxn.model.skeleton.ParsedBinding[0] ); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BindingContext extends ParserRuleContext {
		public org.nxn.model.skeleton.ParsedBinding r;
		public Token n;
		public IndListContext i;
		public TerminalNode NAME() { return getToken(SkeletonParser.NAME, 0); }
		public IndListContext indList() {
			return getRuleContext(IndListContext.class,0);
		}
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((BindingContext)_localctx).n = match(NAME);
			setState(107);
			match(T__2);
			setState(108);
			((BindingContext)_localctx).i = indList();
			 ((BindingContext)_localctx).r =  new org.nxn.model.skeleton.ParsedBinding((((BindingContext)_localctx).n!=null?((BindingContext)_localctx).n.getText():null), ((BindingContext)_localctx).i.r); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndListContext extends ParserRuleContext {
		public int[] r;
		public IntNumContext n;
		public IntNumContext m;
		public List<IntNumContext> intNum() {
			return getRuleContexts(IntNumContext.class);
		}
		public IntNumContext intNum(int i) {
			return getRuleContext(IntNumContext.class,i);
		}
		public IndListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indList; }
	}

	public final IndListContext indList() throws RecognitionException {
		IndListContext _localctx = new IndListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_indList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 java.util.ArrayList<Integer> l = new java.util.ArrayList<Integer>(); 
			setState(112);
			match(T__0);
			setState(113);
			((IndListContext)_localctx).n = intNum();
			 l.add(((IndListContext)_localctx).n.r); 
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(115);
				match(T__4);
				setState(116);
				((IndListContext)_localctx).m = intNum();
				 l.add(((IndListContext)_localctx).m.r); 
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__1);
			 ((IndListContext)_localctx).r =  l.stream().mapToInt(Integer::intValue).toArray(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vector3Context extends ParserRuleContext {
		public org.nxn.math.Vector3f r;
		public FloatNumContext a;
		public FloatNumContext b;
		public FloatNumContext c;
		public List<FloatNumContext> floatNum() {
			return getRuleContexts(FloatNumContext.class);
		}
		public FloatNumContext floatNum(int i) {
			return getRuleContext(FloatNumContext.class,i);
		}
		public Vector3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector3; }
	}

	public final Vector3Context vector3() throws RecognitionException {
		Vector3Context _localctx = new Vector3Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_vector3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__3);
			setState(128);
			((Vector3Context)_localctx).a = floatNum();
			setState(129);
			match(T__4);
			setState(130);
			((Vector3Context)_localctx).b = floatNum();
			setState(131);
			match(T__4);
			setState(132);
			((Vector3Context)_localctx).c = floatNum();
			setState(133);
			match(T__5);
			 ((Vector3Context)_localctx).r =  new org.nxn.math.Vector3f(((Vector3Context)_localctx).a.r, ((Vector3Context)_localctx).b.r, ((Vector3Context)_localctx).c.r); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FloatNumContext extends ParserRuleContext {
		public float r;
		public Token s;
		public Token n;
		public Token m;
		public Token e;
		public Token p;
		public List<TerminalNode> DIGITS() { return getTokens(SkeletonParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(SkeletonParser.DIGITS, i);
		}
		public FloatNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatNum; }
	}

	public final FloatNumContext floatNum() throws RecognitionException {
		FloatNumContext _localctx = new FloatNumContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_floatNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__8) {
				{
				setState(136);
				((FloatNumContext)_localctx).s = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((FloatNumContext)_localctx).s = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(139);
			((FloatNumContext)_localctx).n = match(DIGITS);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(140);
				match(T__9);
				setState(141);
				((FloatNumContext)_localctx).m = match(DIGITS);
				}
			}

			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(144);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7 || _la==T__8) {
					{
					setState(145);
					((FloatNumContext)_localctx).e = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==T__8) ) {
						((FloatNumContext)_localctx).e = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(148);
				((FloatNumContext)_localctx).p = match(DIGITS);
				}
			}


			        StringBuilder sb = new StringBuilder();
			        if((((FloatNumContext)_localctx).s!=null?((FloatNumContext)_localctx).s.getText():null) != null){
			            sb.append((((FloatNumContext)_localctx).s!=null?((FloatNumContext)_localctx).s.getText():null));
			        }
			        sb.append((((FloatNumContext)_localctx).n!=null?((FloatNumContext)_localctx).n.getText():null));
			        if((((FloatNumContext)_localctx).m!=null?((FloatNumContext)_localctx).m.getText():null) != null){
			            sb.append('.').append((((FloatNumContext)_localctx).m!=null?((FloatNumContext)_localctx).m.getText():null));
			        }
			        if((((FloatNumContext)_localctx).p!=null?((FloatNumContext)_localctx).p.getText():null) != null){
			            sb.append('E');
			            if((((FloatNumContext)_localctx).e!=null?((FloatNumContext)_localctx).e.getText():null) != null){
			                sb.append((((FloatNumContext)_localctx).e!=null?((FloatNumContext)_localctx).e.getText():null));
			            }
			            sb.append((((FloatNumContext)_localctx).p!=null?((FloatNumContext)_localctx).p.getText():null));
			        }
			        ((FloatNumContext)_localctx).r =  Float.parseFloat(sb.toString());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntNumContext extends ParserRuleContext {
		public int r;
		public Token n;
		public TerminalNode DIGITS() { return getToken(SkeletonParser.DIGITS, 0); }
		public IntNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intNum; }
	}

	public final IntNumContext intNum() throws RecognitionException {
		IntNumContext _localctx = new IntNumContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_intNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((IntNumContext)_localctx).n = match(DIGITS);
			 ((IntNumContext)_localctx).r =  Integer.parseInt((((IntNumContext)_localctx).n!=null?((IntNumContext)_localctx).n.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000f\u009d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"$\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001,\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003<\b"+
		"\u0003\n\u0003\f\u0003?\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005S\b\u0005\n\u0005\f\u0005V\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006c\b\u0006\n\u0006\f\u0006f\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bx\b"+
		"\b\n\b\f\b{\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0003\n\u008a\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u008f\b\n\u0001\n\u0001\n\u0003\n\u0093\b\n"+
		"\u0001\n\u0003\n\u0096\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0000\u0002\u0001\u0000\b\t\u0001\u0000\u000b\f\u009b"+
		"\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000"+
		"\u0004/\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\bC\u0001"+
		"\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fZ\u0001\u0000\u0000\u0000"+
		"\u000ej\u0001\u0000\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012\u007f"+
		"\u0001\u0000\u0000\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u0099"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019\u001a"+
		"\u0003\u0002\u0001\u0000\u001a\u001b\u0005\u0002\u0000\u0000\u001b\u001c"+
		"\u0006\u0000\uffff\uffff\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005\r\u0000\u0000\u001e#\u0005\u0003\u0000\u0000\u001f \u0003"+
		"\u0012\t\u0000 !\u0003\u0004\u0002\u0000!$\u0001\u0000\u0000\u0000\"$"+
		"\u0003\u0006\u0003\u0000#\u001f\u0001\u0000\u0000\u0000#\"\u0001\u0000"+
		"\u0000\u0000$\'\u0001\u0000\u0000\u0000%&\u0005\u0003\u0000\u0000&(\u0003"+
		"\f\u0006\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000("+
		"+\u0001\u0000\u0000\u0000)*\u0005\u0003\u0000\u0000*,\u0003\n\u0005\u0000"+
		"+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-.\u0006\u0001\uffff\uffff\u0000.\u0003\u0001\u0000\u0000\u0000"+
		"/0\u0005\u0003\u0000\u000001\u0005\r\u0000\u000012\u0006\u0002\uffff\uffff"+
		"\u00002\u0005\u0001\u0000\u0000\u000034\u0006\u0003\uffff\uffff\u0000"+
		"45\u0005\u0004\u0000\u000056\u0003\b\u0004\u00006=\u0006\u0003\uffff\uffff"+
		"\u000078\u0005\u0005\u0000\u000089\u0003\b\u0004\u00009:\u0006\u0003\uffff"+
		"\uffff\u0000:<\u0001\u0000\u0000\u0000;7\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0006\u0000"+
		"\u0000AB\u0006\u0003\uffff\uffff\u0000B\u0007\u0001\u0000\u0000\u0000"+
		"CD\u0003\u0014\n\u0000DE\u0005\u0003\u0000\u0000EF\u0005\r\u0000\u0000"+
		"FG\u0005\u0007\u0000\u0000GH\u0005\r\u0000\u0000HI\u0006\u0004\uffff\uffff"+
		"\u0000I\t\u0001\u0000\u0000\u0000JK\u0006\u0005\uffff\uffff\u0000KL\u0005"+
		"\u0001\u0000\u0000LM\u0003\u0002\u0001\u0000MT\u0006\u0005\uffff\uffff"+
		"\u0000NO\u0005\u0005\u0000\u0000OP\u0003\u0002\u0001\u0000PQ\u0006\u0005"+
		"\uffff\uffff\u0000QS\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000"+
		"SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0005\u0002"+
		"\u0000\u0000XY\u0006\u0005\uffff\uffff\u0000Y\u000b\u0001\u0000\u0000"+
		"\u0000Z[\u0006\u0006\uffff\uffff\u0000[\\\u0005\u0001\u0000\u0000\\]\u0003"+
		"\u000e\u0007\u0000]d\u0006\u0006\uffff\uffff\u0000^_\u0005\u0005\u0000"+
		"\u0000_`\u0003\u000e\u0007\u0000`a\u0006\u0006\uffff\uffff\u0000ac\u0001"+
		"\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000gh\u0005\u0002\u0000\u0000hi\u0006\u0006"+
		"\uffff\uffff\u0000i\r\u0001\u0000\u0000\u0000jk\u0005\r\u0000\u0000kl"+
		"\u0005\u0003\u0000\u0000lm\u0003\u0010\b\u0000mn\u0006\u0007\uffff\uffff"+
		"\u0000n\u000f\u0001\u0000\u0000\u0000op\u0006\b\uffff\uffff\u0000pq\u0005"+
		"\u0001\u0000\u0000qr\u0003\u0016\u000b\u0000ry\u0006\b\uffff\uffff\u0000"+
		"st\u0005\u0005\u0000\u0000tu\u0003\u0016\u000b\u0000uv\u0006\b\uffff\uffff"+
		"\u0000vx\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000\u0000x{\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0002\u0000\u0000"+
		"}~\u0006\b\uffff\uffff\u0000~\u0011\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u0004\u0000\u0000\u0080\u0081\u0003\u0014\n\u0000\u0081\u0082\u0005"+
		"\u0005\u0000\u0000\u0082\u0083\u0003\u0014\n\u0000\u0083\u0084\u0005\u0005"+
		"\u0000\u0000\u0084\u0085\u0003\u0014\n\u0000\u0085\u0086\u0005\u0006\u0000"+
		"\u0000\u0086\u0087\u0006\t\uffff\uffff\u0000\u0087\u0013\u0001\u0000\u0000"+
		"\u0000\u0088\u008a\u0007\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008e\u0005\u000e\u0000\u0000\u008c\u008d\u0005\n\u0000\u0000"+
		"\u008d\u008f\u0005\u000e\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0095\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u0007\u0001\u0000\u0000\u0091\u0093\u0007\u0000\u0000\u0000"+
		"\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0005\u000e\u0000\u0000"+
		"\u0095\u0090\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0006\n\uffff\uffff\u0000"+
		"\u0098\u0015\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u000e\u0000\u0000"+
		"\u009a\u009b\u0006\u000b\uffff\uffff\u0000\u009b\u0017\u0001\u0000\u0000"+
		"\u0000\u000b#\'+=Tdy\u0089\u008e\u0092\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}