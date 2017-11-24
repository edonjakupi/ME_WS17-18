package at.ac.tuwien.big.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import at.ac.tuwien.big.services.StlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'system'", "'{'", "'}'", "'area'", "'item'", "'='", "'>'", "'service'", "'(cost='", "',reliability='", "',processingTime='", "')'", "'){'", "'input'", "':'", "'generator'", "'generates'", "'output'", "'productStore'", "',capacity='", "'wasteStore'", "'buffer'", "'conveyor'", "'machine'", "'turntable'", "'.'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStl.g"; }


    	private StlGrammarAccess grammarAccess;

    	public void setGrammarAccess(StlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSystem"
    // InternalStl.g:54:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalStl.g:55:1: ( ruleSystem EOF )
            // InternalStl.g:56:1: ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalStl.g:63:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:67:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalStl.g:68:2: ( ( rule__System__Group__0 ) )
            {
            // InternalStl.g:68:2: ( ( rule__System__Group__0 ) )
            // InternalStl.g:69:3: ( rule__System__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup()); 
            }
            // InternalStl.g:70:3: ( rule__System__Group__0 )
            // InternalStl.g:70:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleArea"
    // InternalStl.g:79:1: entryRuleArea : ruleArea EOF ;
    public final void entryRuleArea() throws RecognitionException {
        try {
            // InternalStl.g:80:1: ( ruleArea EOF )
            // InternalStl.g:81:1: ruleArea EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArea();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalStl.g:88:1: ruleArea : ( ( rule__Area__Group__0 ) ) ;
    public final void ruleArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:92:2: ( ( ( rule__Area__Group__0 ) ) )
            // InternalStl.g:93:2: ( ( rule__Area__Group__0 ) )
            {
            // InternalStl.g:93:2: ( ( rule__Area__Group__0 ) )
            // InternalStl.g:94:3: ( rule__Area__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getGroup()); 
            }
            // InternalStl.g:95:3: ( rule__Area__Group__0 )
            // InternalStl.g:95:4: rule__Area__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArea"


    // $ANTLR start "entryRuleItemType"
    // InternalStl.g:104:1: entryRuleItemType : ruleItemType EOF ;
    public final void entryRuleItemType() throws RecognitionException {
        try {
            // InternalStl.g:105:1: ( ruleItemType EOF )
            // InternalStl.g:106:1: ruleItemType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleItemType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemType"


    // $ANTLR start "ruleItemType"
    // InternalStl.g:113:1: ruleItemType : ( ( rule__ItemType__Group__0 ) ) ;
    public final void ruleItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:117:2: ( ( ( rule__ItemType__Group__0 ) ) )
            // InternalStl.g:118:2: ( ( rule__ItemType__Group__0 ) )
            {
            // InternalStl.g:118:2: ( ( rule__ItemType__Group__0 ) )
            // InternalStl.g:119:3: ( rule__ItemType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getGroup()); 
            }
            // InternalStl.g:120:3: ( rule__ItemType__Group__0 )
            // InternalStl.g:120:4: rule__ItemType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemType"


    // $ANTLR start "entryRuleConnector"
    // InternalStl.g:129:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalStl.g:130:1: ( ruleConnector EOF )
            // InternalStl.g:131:1: ruleConnector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConnector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalStl.g:138:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:142:2: ( ( ( rule__Connector__Group__0 ) ) )
            // InternalStl.g:143:2: ( ( rule__Connector__Group__0 ) )
            {
            // InternalStl.g:143:2: ( ( rule__Connector__Group__0 ) )
            // InternalStl.g:144:3: ( rule__Connector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getGroup()); 
            }
            // InternalStl.g:145:3: ( rule__Connector__Group__0 )
            // InternalStl.g:145:4: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleComponent"
    // InternalStl.g:154:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalStl.g:155:1: ( ruleComponent EOF )
            // InternalStl.g:156:1: ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalStl.g:163:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:167:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalStl.g:168:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalStl.g:168:2: ( ( rule__Component__Alternatives ) )
            // InternalStl.g:169:3: ( rule__Component__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getAlternatives()); 
            }
            // InternalStl.g:170:3: ( rule__Component__Alternatives )
            // InternalStl.g:170:4: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleService"
    // InternalStl.g:179:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalStl.g:180:1: ( ruleService EOF )
            // InternalStl.g:181:1: ruleService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalStl.g:188:1: ruleService : ( ( rule__Service__Alternatives ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:192:2: ( ( ( rule__Service__Alternatives ) ) )
            // InternalStl.g:193:2: ( ( rule__Service__Alternatives ) )
            {
            // InternalStl.g:193:2: ( ( rule__Service__Alternatives ) )
            // InternalStl.g:194:3: ( rule__Service__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getAlternatives()); 
            }
            // InternalStl.g:195:3: ( rule__Service__Alternatives )
            // InternalStl.g:195:4: rule__Service__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Service__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleParameter"
    // InternalStl.g:204:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalStl.g:205:1: ( ruleParameter EOF )
            // InternalStl.g:206:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalStl.g:213:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:217:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalStl.g:218:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalStl.g:218:2: ( ( rule__Parameter__Group__0 ) )
            // InternalStl.g:219:3: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalStl.g:220:3: ( rule__Parameter__Group__0 )
            // InternalStl.g:220:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleSlot"
    // InternalStl.g:229:1: entryRuleSlot : ruleSlot EOF ;
    public final void entryRuleSlot() throws RecognitionException {
        try {
            // InternalStl.g:230:1: ( ruleSlot EOF )
            // InternalStl.g:231:1: ruleSlot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSlot"


    // $ANTLR start "ruleSlot"
    // InternalStl.g:238:1: ruleSlot : ( ( rule__Slot__Group__0 ) ) ;
    public final void ruleSlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:242:2: ( ( ( rule__Slot__Group__0 ) ) )
            // InternalStl.g:243:2: ( ( rule__Slot__Group__0 ) )
            {
            // InternalStl.g:243:2: ( ( rule__Slot__Group__0 ) )
            // InternalStl.g:244:3: ( rule__Slot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getGroup()); 
            }
            // InternalStl.g:245:3: ( rule__Slot__Group__0 )
            // InternalStl.g:245:4: rule__Slot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Slot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlot"


    // $ANTLR start "entryRuleItemGenerator"
    // InternalStl.g:254:1: entryRuleItemGenerator : ruleItemGenerator EOF ;
    public final void entryRuleItemGenerator() throws RecognitionException {
        try {
            // InternalStl.g:255:1: ( ruleItemGenerator EOF )
            // InternalStl.g:256:1: ruleItemGenerator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleItemGenerator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemGenerator"


    // $ANTLR start "ruleItemGenerator"
    // InternalStl.g:263:1: ruleItemGenerator : ( ( rule__ItemGenerator__Group__0 ) ) ;
    public final void ruleItemGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:267:2: ( ( ( rule__ItemGenerator__Group__0 ) ) )
            // InternalStl.g:268:2: ( ( rule__ItemGenerator__Group__0 ) )
            {
            // InternalStl.g:268:2: ( ( rule__ItemGenerator__Group__0 ) )
            // InternalStl.g:269:3: ( rule__ItemGenerator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGroup()); 
            }
            // InternalStl.g:270:3: ( rule__ItemGenerator__Group__0 )
            // InternalStl.g:270:4: rule__ItemGenerator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemGenerator"


    // $ANTLR start "entryRuleStore"
    // InternalStl.g:279:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalStl.g:280:1: ( ruleStore EOF )
            // InternalStl.g:281:1: ruleStore EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStore();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStoreRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalStl.g:288:1: ruleStore : ( ( rule__Store__Alternatives ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:292:2: ( ( ( rule__Store__Alternatives ) ) )
            // InternalStl.g:293:2: ( ( rule__Store__Alternatives ) )
            {
            // InternalStl.g:293:2: ( ( rule__Store__Alternatives ) )
            // InternalStl.g:294:3: ( rule__Store__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStoreAccess().getAlternatives()); 
            }
            // InternalStl.g:295:3: ( rule__Store__Alternatives )
            // InternalStl.g:295:4: rule__Store__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Store__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStoreAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleProductStore"
    // InternalStl.g:304:1: entryRuleProductStore : ruleProductStore EOF ;
    public final void entryRuleProductStore() throws RecognitionException {
        try {
            // InternalStl.g:305:1: ( ruleProductStore EOF )
            // InternalStl.g:306:1: ruleProductStore EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProductStore();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProductStore"


    // $ANTLR start "ruleProductStore"
    // InternalStl.g:313:1: ruleProductStore : ( ( rule__ProductStore__Group__0 ) ) ;
    public final void ruleProductStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:317:2: ( ( ( rule__ProductStore__Group__0 ) ) )
            // InternalStl.g:318:2: ( ( rule__ProductStore__Group__0 ) )
            {
            // InternalStl.g:318:2: ( ( rule__ProductStore__Group__0 ) )
            // InternalStl.g:319:3: ( rule__ProductStore__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getGroup()); 
            }
            // InternalStl.g:320:3: ( rule__ProductStore__Group__0 )
            // InternalStl.g:320:4: rule__ProductStore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProductStore"


    // $ANTLR start "entryRuleWasteStore"
    // InternalStl.g:329:1: entryRuleWasteStore : ruleWasteStore EOF ;
    public final void entryRuleWasteStore() throws RecognitionException {
        try {
            // InternalStl.g:330:1: ( ruleWasteStore EOF )
            // InternalStl.g:331:1: ruleWasteStore EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWasteStore();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWasteStore"


    // $ANTLR start "ruleWasteStore"
    // InternalStl.g:338:1: ruleWasteStore : ( ( rule__WasteStore__Group__0 ) ) ;
    public final void ruleWasteStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:342:2: ( ( ( rule__WasteStore__Group__0 ) ) )
            // InternalStl.g:343:2: ( ( rule__WasteStore__Group__0 ) )
            {
            // InternalStl.g:343:2: ( ( rule__WasteStore__Group__0 ) )
            // InternalStl.g:344:3: ( rule__WasteStore__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getGroup()); 
            }
            // InternalStl.g:345:3: ( rule__WasteStore__Group__0 )
            // InternalStl.g:345:4: rule__WasteStore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWasteStore"


    // $ANTLR start "entryRuleBuffer"
    // InternalStl.g:354:1: entryRuleBuffer : ruleBuffer EOF ;
    public final void entryRuleBuffer() throws RecognitionException {
        try {
            // InternalStl.g:355:1: ( ruleBuffer EOF )
            // InternalStl.g:356:1: ruleBuffer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBuffer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuffer"


    // $ANTLR start "ruleBuffer"
    // InternalStl.g:363:1: ruleBuffer : ( ( rule__Buffer__Group__0 ) ) ;
    public final void ruleBuffer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:367:2: ( ( ( rule__Buffer__Group__0 ) ) )
            // InternalStl.g:368:2: ( ( rule__Buffer__Group__0 ) )
            {
            // InternalStl.g:368:2: ( ( rule__Buffer__Group__0 ) )
            // InternalStl.g:369:3: ( rule__Buffer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getGroup()); 
            }
            // InternalStl.g:370:3: ( rule__Buffer__Group__0 )
            // InternalStl.g:370:4: rule__Buffer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuffer"


    // $ANTLR start "entryRuleConveyor"
    // InternalStl.g:379:1: entryRuleConveyor : ruleConveyor EOF ;
    public final void entryRuleConveyor() throws RecognitionException {
        try {
            // InternalStl.g:380:1: ( ruleConveyor EOF )
            // InternalStl.g:381:1: ruleConveyor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConveyor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConveyor"


    // $ANTLR start "ruleConveyor"
    // InternalStl.g:388:1: ruleConveyor : ( ( rule__Conveyor__Group__0 ) ) ;
    public final void ruleConveyor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:392:2: ( ( ( rule__Conveyor__Group__0 ) ) )
            // InternalStl.g:393:2: ( ( rule__Conveyor__Group__0 ) )
            {
            // InternalStl.g:393:2: ( ( rule__Conveyor__Group__0 ) )
            // InternalStl.g:394:3: ( rule__Conveyor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getGroup()); 
            }
            // InternalStl.g:395:3: ( rule__Conveyor__Group__0 )
            // InternalStl.g:395:4: rule__Conveyor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConveyor"


    // $ANTLR start "entryRuleMachine"
    // InternalStl.g:404:1: entryRuleMachine : ruleMachine EOF ;
    public final void entryRuleMachine() throws RecognitionException {
        try {
            // InternalStl.g:405:1: ( ruleMachine EOF )
            // InternalStl.g:406:1: ruleMachine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMachine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalStl.g:413:1: ruleMachine : ( ( rule__Machine__Group__0 ) ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:417:2: ( ( ( rule__Machine__Group__0 ) ) )
            // InternalStl.g:418:2: ( ( rule__Machine__Group__0 ) )
            {
            // InternalStl.g:418:2: ( ( rule__Machine__Group__0 ) )
            // InternalStl.g:419:3: ( rule__Machine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup()); 
            }
            // InternalStl.g:420:3: ( rule__Machine__Group__0 )
            // InternalStl.g:420:4: rule__Machine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleTurnTable"
    // InternalStl.g:429:1: entryRuleTurnTable : ruleTurnTable EOF ;
    public final void entryRuleTurnTable() throws RecognitionException {
        try {
            // InternalStl.g:430:1: ( ruleTurnTable EOF )
            // InternalStl.g:431:1: ruleTurnTable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTurnTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnTable"


    // $ANTLR start "ruleTurnTable"
    // InternalStl.g:438:1: ruleTurnTable : ( ( rule__TurnTable__Group__0 ) ) ;
    public final void ruleTurnTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:442:2: ( ( ( rule__TurnTable__Group__0 ) ) )
            // InternalStl.g:443:2: ( ( rule__TurnTable__Group__0 ) )
            {
            // InternalStl.g:443:2: ( ( rule__TurnTable__Group__0 ) )
            // InternalStl.g:444:3: ( rule__TurnTable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getGroup()); 
            }
            // InternalStl.g:445:3: ( rule__TurnTable__Group__0 )
            // InternalStl.g:445:4: rule__TurnTable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnTable"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalStl.g:454:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalStl.g:455:1: ( ruleQualifiedName EOF )
            // InternalStl.g:456:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalStl.g:463:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:467:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalStl.g:468:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalStl.g:468:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalStl.g:469:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalStl.g:470:3: ( rule__QualifiedName__Group__0 )
            // InternalStl.g:470:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEDouble"
    // InternalStl.g:479:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalStl.g:480:1: ( ruleEDouble EOF )
            // InternalStl.g:481:1: ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalStl.g:488:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:492:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalStl.g:493:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalStl.g:493:2: ( ( rule__EDouble__Group__0 ) )
            // InternalStl.g:494:3: ( rule__EDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getGroup()); 
            }
            // InternalStl.g:495:3: ( rule__EDouble__Group__0 )
            // InternalStl.g:495:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // InternalStl.g:504:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalStl.g:505:1: ( ruleEString EOF )
            // InternalStl.g:506:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalStl.g:513:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:517:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalStl.g:518:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalStl.g:518:2: ( ( rule__EString__Alternatives ) )
            // InternalStl.g:519:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalStl.g:520:3: ( rule__EString__Alternatives )
            // InternalStl.g:520:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalStl.g:529:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalStl.g:530:1: ( ruleEInt EOF )
            // InternalStl.g:531:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalStl.g:538:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:542:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalStl.g:543:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalStl.g:543:2: ( ( rule__EInt__Group__0 ) )
            // InternalStl.g:544:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalStl.g:545:3: ( rule__EInt__Group__0 )
            // InternalStl.g:545:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalStl.g:553:1: rule__Component__Alternatives : ( ( ruleItemGenerator ) | ( ruleStore ) | ( ruleBuffer ) | ( ruleConveyor ) | ( ruleMachine ) | ( ruleTurnTable ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:557:1: ( ( ruleItemGenerator ) | ( ruleStore ) | ( ruleBuffer ) | ( ruleConveyor ) | ( ruleMachine ) | ( ruleTurnTable ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 31:
            case 33:
                {
                alt1=2;
                }
                break;
            case 34:
                {
                alt1=3;
                }
                break;
            case 35:
                {
                alt1=4;
                }
                break;
            case 36:
                {
                alt1=5;
                }
                break;
            case 37:
                {
                alt1=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalStl.g:558:2: ( ruleItemGenerator )
                    {
                    // InternalStl.g:558:2: ( ruleItemGenerator )
                    // InternalStl.g:559:3: ruleItemGenerator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getItemGeneratorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleItemGenerator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getItemGeneratorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:564:2: ( ruleStore )
                    {
                    // InternalStl.g:564:2: ( ruleStore )
                    // InternalStl.g:565:3: ruleStore
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getStoreParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStore();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getStoreParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStl.g:570:2: ( ruleBuffer )
                    {
                    // InternalStl.g:570:2: ( ruleBuffer )
                    // InternalStl.g:571:3: ruleBuffer
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getBufferParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBuffer();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getBufferParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStl.g:576:2: ( ruleConveyor )
                    {
                    // InternalStl.g:576:2: ( ruleConveyor )
                    // InternalStl.g:577:3: ruleConveyor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getConveyorParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConveyor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getConveyorParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalStl.g:582:2: ( ruleMachine )
                    {
                    // InternalStl.g:582:2: ( ruleMachine )
                    // InternalStl.g:583:3: ruleMachine
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getMachineParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMachine();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getMachineParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalStl.g:588:2: ( ruleTurnTable )
                    {
                    // InternalStl.g:588:2: ( ruleTurnTable )
                    // InternalStl.g:589:3: ruleTurnTable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getTurnTableParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTurnTable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getTurnTableParserRuleCall_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives"


    // $ANTLR start "rule__Service__Alternatives"
    // InternalStl.g:598:1: rule__Service__Alternatives : ( ( ( rule__Service__Group_0__0 ) ) | ( ( rule__Service__Group_1__0 ) ) );
    public final void rule__Service__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:602:1: ( ( ( rule__Service__Group_0__0 ) ) | ( ( rule__Service__Group_1__0 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalStl.g:603:2: ( ( rule__Service__Group_0__0 ) )
                    {
                    // InternalStl.g:603:2: ( ( rule__Service__Group_0__0 ) )
                    // InternalStl.g:604:3: ( rule__Service__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getServiceAccess().getGroup_0()); 
                    }
                    // InternalStl.g:605:3: ( rule__Service__Group_0__0 )
                    // InternalStl.g:605:4: rule__Service__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getServiceAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:609:2: ( ( rule__Service__Group_1__0 ) )
                    {
                    // InternalStl.g:609:2: ( ( rule__Service__Group_1__0 ) )
                    // InternalStl.g:610:3: ( rule__Service__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getServiceAccess().getGroup_1()); 
                    }
                    // InternalStl.g:611:3: ( rule__Service__Group_1__0 )
                    // InternalStl.g:611:4: rule__Service__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getServiceAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Alternatives"


    // $ANTLR start "rule__Store__Alternatives"
    // InternalStl.g:619:1: rule__Store__Alternatives : ( ( ruleProductStore ) | ( ruleWasteStore ) );
    public final void rule__Store__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:623:1: ( ( ruleProductStore ) | ( ruleWasteStore ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalStl.g:624:2: ( ruleProductStore )
                    {
                    // InternalStl.g:624:2: ( ruleProductStore )
                    // InternalStl.g:625:3: ruleProductStore
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStoreAccess().getProductStoreParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleProductStore();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStoreAccess().getProductStoreParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:630:2: ( ruleWasteStore )
                    {
                    // InternalStl.g:630:2: ( ruleWasteStore )
                    // InternalStl.g:631:3: ruleWasteStore
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStoreAccess().getWasteStoreParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWasteStore();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStoreAccess().getWasteStoreParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalStl.g:640:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:644:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalStl.g:645:2: ( 'E' )
                    {
                    // InternalStl.g:645:2: ( 'E' )
                    // InternalStl.g:646:3: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:651:2: ( 'e' )
                    {
                    // InternalStl.g:651:2: ( 'e' )
                    // InternalStl.g:652:3: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalStl.g:661:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:665:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalStl.g:666:2: ( RULE_STRING )
                    {
                    // InternalStl.g:666:2: ( RULE_STRING )
                    // InternalStl.g:667:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:672:2: ( RULE_ID )
                    {
                    // InternalStl.g:672:2: ( RULE_ID )
                    // InternalStl.g:673:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__System__Group__0"
    // InternalStl.g:682:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:686:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalStl.g:687:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__System__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalStl.g:694:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:698:1: ( ( 'system' ) )
            // InternalStl.g:699:1: ( 'system' )
            {
            // InternalStl.g:699:1: ( 'system' )
            // InternalStl.g:700:2: 'system'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalStl.g:709:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:713:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalStl.g:714:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalStl.g:721:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:725:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalStl.g:726:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalStl.g:726:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalStl.g:727:2: ( rule__System__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:728:2: ( rule__System__NameAssignment_1 )
            // InternalStl.g:728:3: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalStl.g:736:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:740:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalStl.g:741:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalStl.g:748:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:752:1: ( ( '{' ) )
            // InternalStl.g:753:1: ( '{' )
            {
            // InternalStl.g:753:1: ( '{' )
            // InternalStl.g:754:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalStl.g:763:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:767:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalStl.g:768:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalStl.g:775:1: rule__System__Group__3__Impl : ( ( rule__System__ItemTypesAssignment_3 )* ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:779:1: ( ( ( rule__System__ItemTypesAssignment_3 )* ) )
            // InternalStl.g:780:1: ( ( rule__System__ItemTypesAssignment_3 )* )
            {
            // InternalStl.g:780:1: ( ( rule__System__ItemTypesAssignment_3 )* )
            // InternalStl.g:781:2: ( rule__System__ItemTypesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getItemTypesAssignment_3()); 
            }
            // InternalStl.g:782:2: ( rule__System__ItemTypesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStl.g:782:3: rule__System__ItemTypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__System__ItemTypesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getItemTypesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalStl.g:790:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:794:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalStl.g:795:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalStl.g:802:1: rule__System__Group__4__Impl : ( ( rule__System__AreasAssignment_4 )* ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:806:1: ( ( ( rule__System__AreasAssignment_4 )* ) )
            // InternalStl.g:807:1: ( ( rule__System__AreasAssignment_4 )* )
            {
            // InternalStl.g:807:1: ( ( rule__System__AreasAssignment_4 )* )
            // InternalStl.g:808:2: ( rule__System__AreasAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getAreasAssignment_4()); 
            }
            // InternalStl.g:809:2: ( rule__System__AreasAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStl.g:809:3: rule__System__AreasAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__System__AreasAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getAreasAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // InternalStl.g:817:1: rule__System__Group__5 : rule__System__Group__5__Impl ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:821:1: ( rule__System__Group__5__Impl )
            // InternalStl.g:822:2: rule__System__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // InternalStl.g:828:1: rule__System__Group__5__Impl : ( '}' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:832:1: ( ( '}' ) )
            // InternalStl.g:833:1: ( '}' )
            {
            // InternalStl.g:833:1: ( '}' )
            // InternalStl.g:834:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__Area__Group__0"
    // InternalStl.g:844:1: rule__Area__Group__0 : rule__Area__Group__0__Impl rule__Area__Group__1 ;
    public final void rule__Area__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:848:1: ( rule__Area__Group__0__Impl rule__Area__Group__1 )
            // InternalStl.g:849:2: rule__Area__Group__0__Impl rule__Area__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Area__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__0"


    // $ANTLR start "rule__Area__Group__0__Impl"
    // InternalStl.g:856:1: rule__Area__Group__0__Impl : ( 'area' ) ;
    public final void rule__Area__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:860:1: ( ( 'area' ) )
            // InternalStl.g:861:1: ( 'area' )
            {
            // InternalStl.g:861:1: ( 'area' )
            // InternalStl.g:862:2: 'area'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getAreaKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getAreaKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__0__Impl"


    // $ANTLR start "rule__Area__Group__1"
    // InternalStl.g:871:1: rule__Area__Group__1 : rule__Area__Group__1__Impl rule__Area__Group__2 ;
    public final void rule__Area__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:875:1: ( rule__Area__Group__1__Impl rule__Area__Group__2 )
            // InternalStl.g:876:2: rule__Area__Group__1__Impl rule__Area__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Area__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__1"


    // $ANTLR start "rule__Area__Group__1__Impl"
    // InternalStl.g:883:1: rule__Area__Group__1__Impl : ( ( rule__Area__NameAssignment_1 ) ) ;
    public final void rule__Area__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:887:1: ( ( ( rule__Area__NameAssignment_1 ) ) )
            // InternalStl.g:888:1: ( ( rule__Area__NameAssignment_1 ) )
            {
            // InternalStl.g:888:1: ( ( rule__Area__NameAssignment_1 ) )
            // InternalStl.g:889:2: ( rule__Area__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:890:2: ( rule__Area__NameAssignment_1 )
            // InternalStl.g:890:3: rule__Area__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Area__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__1__Impl"


    // $ANTLR start "rule__Area__Group__2"
    // InternalStl.g:898:1: rule__Area__Group__2 : rule__Area__Group__2__Impl rule__Area__Group__3 ;
    public final void rule__Area__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:902:1: ( rule__Area__Group__2__Impl rule__Area__Group__3 )
            // InternalStl.g:903:2: rule__Area__Group__2__Impl rule__Area__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Area__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__2"


    // $ANTLR start "rule__Area__Group__2__Impl"
    // InternalStl.g:910:1: rule__Area__Group__2__Impl : ( '{' ) ;
    public final void rule__Area__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:914:1: ( ( '{' ) )
            // InternalStl.g:915:1: ( '{' )
            {
            // InternalStl.g:915:1: ( '{' )
            // InternalStl.g:916:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__2__Impl"


    // $ANTLR start "rule__Area__Group__3"
    // InternalStl.g:925:1: rule__Area__Group__3 : rule__Area__Group__3__Impl rule__Area__Group__4 ;
    public final void rule__Area__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:929:1: ( rule__Area__Group__3__Impl rule__Area__Group__4 )
            // InternalStl.g:930:2: rule__Area__Group__3__Impl rule__Area__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Area__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__3"


    // $ANTLR start "rule__Area__Group__3__Impl"
    // InternalStl.g:937:1: rule__Area__Group__3__Impl : ( ( rule__Area__ComponentsAssignment_3 )* ) ;
    public final void rule__Area__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:941:1: ( ( ( rule__Area__ComponentsAssignment_3 )* ) )
            // InternalStl.g:942:1: ( ( rule__Area__ComponentsAssignment_3 )* )
            {
            // InternalStl.g:942:1: ( ( rule__Area__ComponentsAssignment_3 )* )
            // InternalStl.g:943:2: ( rule__Area__ComponentsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getComponentsAssignment_3()); 
            }
            // InternalStl.g:944:2: ( rule__Area__ComponentsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28||LA8_0==31||(LA8_0>=33 && LA8_0<=37)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalStl.g:944:3: rule__Area__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Area__ComponentsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getComponentsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__3__Impl"


    // $ANTLR start "rule__Area__Group__4"
    // InternalStl.g:952:1: rule__Area__Group__4 : rule__Area__Group__4__Impl rule__Area__Group__5 ;
    public final void rule__Area__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:956:1: ( rule__Area__Group__4__Impl rule__Area__Group__5 )
            // InternalStl.g:957:2: rule__Area__Group__4__Impl rule__Area__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Area__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__4"


    // $ANTLR start "rule__Area__Group__4__Impl"
    // InternalStl.g:964:1: rule__Area__Group__4__Impl : ( ( rule__Area__ConnectorsAssignment_4 )* ) ;
    public final void rule__Area__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:968:1: ( ( ( rule__Area__ConnectorsAssignment_4 )* ) )
            // InternalStl.g:969:1: ( ( rule__Area__ConnectorsAssignment_4 )* )
            {
            // InternalStl.g:969:1: ( ( rule__Area__ConnectorsAssignment_4 )* )
            // InternalStl.g:970:2: ( rule__Area__ConnectorsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getConnectorsAssignment_4()); 
            }
            // InternalStl.g:971:2: ( rule__Area__ConnectorsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalStl.g:971:3: rule__Area__ConnectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Area__ConnectorsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getConnectorsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__4__Impl"


    // $ANTLR start "rule__Area__Group__5"
    // InternalStl.g:979:1: rule__Area__Group__5 : rule__Area__Group__5__Impl ;
    public final void rule__Area__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:983:1: ( rule__Area__Group__5__Impl )
            // InternalStl.g:984:2: rule__Area__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__5"


    // $ANTLR start "rule__Area__Group__5__Impl"
    // InternalStl.g:990:1: rule__Area__Group__5__Impl : ( '}' ) ;
    public final void rule__Area__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:994:1: ( ( '}' ) )
            // InternalStl.g:995:1: ( '}' )
            {
            // InternalStl.g:995:1: ( '}' )
            // InternalStl.g:996:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__5__Impl"


    // $ANTLR start "rule__ItemType__Group__0"
    // InternalStl.g:1006:1: rule__ItemType__Group__0 : rule__ItemType__Group__0__Impl rule__ItemType__Group__1 ;
    public final void rule__ItemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1010:1: ( rule__ItemType__Group__0__Impl rule__ItemType__Group__1 )
            // InternalStl.g:1011:2: rule__ItemType__Group__0__Impl rule__ItemType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ItemType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__0"


    // $ANTLR start "rule__ItemType__Group__0__Impl"
    // InternalStl.g:1018:1: rule__ItemType__Group__0__Impl : ( 'item' ) ;
    public final void rule__ItemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1022:1: ( ( 'item' ) )
            // InternalStl.g:1023:1: ( 'item' )
            {
            // InternalStl.g:1023:1: ( 'item' )
            // InternalStl.g:1024:2: 'item'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getItemKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getItemKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__0__Impl"


    // $ANTLR start "rule__ItemType__Group__1"
    // InternalStl.g:1033:1: rule__ItemType__Group__1 : rule__ItemType__Group__1__Impl rule__ItemType__Group__2 ;
    public final void rule__ItemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1037:1: ( rule__ItemType__Group__1__Impl rule__ItemType__Group__2 )
            // InternalStl.g:1038:2: rule__ItemType__Group__1__Impl rule__ItemType__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ItemType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__1"


    // $ANTLR start "rule__ItemType__Group__1__Impl"
    // InternalStl.g:1045:1: rule__ItemType__Group__1__Impl : ( ( rule__ItemType__NameAssignment_1 ) ) ;
    public final void rule__ItemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1049:1: ( ( ( rule__ItemType__NameAssignment_1 ) ) )
            // InternalStl.g:1050:1: ( ( rule__ItemType__NameAssignment_1 ) )
            {
            // InternalStl.g:1050:1: ( ( rule__ItemType__NameAssignment_1 ) )
            // InternalStl.g:1051:2: ( rule__ItemType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:1052:2: ( rule__ItemType__NameAssignment_1 )
            // InternalStl.g:1052:3: rule__ItemType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__1__Impl"


    // $ANTLR start "rule__ItemType__Group__2"
    // InternalStl.g:1060:1: rule__ItemType__Group__2 : rule__ItemType__Group__2__Impl rule__ItemType__Group__3 ;
    public final void rule__ItemType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1064:1: ( rule__ItemType__Group__2__Impl rule__ItemType__Group__3 )
            // InternalStl.g:1065:2: rule__ItemType__Group__2__Impl rule__ItemType__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ItemType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__2"


    // $ANTLR start "rule__ItemType__Group__2__Impl"
    // InternalStl.g:1072:1: rule__ItemType__Group__2__Impl : ( '=' ) ;
    public final void rule__ItemType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1076:1: ( ( '=' ) )
            // InternalStl.g:1077:1: ( '=' )
            {
            // InternalStl.g:1077:1: ( '=' )
            // InternalStl.g:1078:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getEqualsSignKeyword_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__2__Impl"


    // $ANTLR start "rule__ItemType__Group__3"
    // InternalStl.g:1087:1: rule__ItemType__Group__3 : rule__ItemType__Group__3__Impl ;
    public final void rule__ItemType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1091:1: ( rule__ItemType__Group__3__Impl )
            // InternalStl.g:1092:2: rule__ItemType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__3"


    // $ANTLR start "rule__ItemType__Group__3__Impl"
    // InternalStl.g:1098:1: rule__ItemType__Group__3__Impl : ( ( rule__ItemType__DescriptionAssignment_3 ) ) ;
    public final void rule__ItemType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1102:1: ( ( ( rule__ItemType__DescriptionAssignment_3 ) ) )
            // InternalStl.g:1103:1: ( ( rule__ItemType__DescriptionAssignment_3 ) )
            {
            // InternalStl.g:1103:1: ( ( rule__ItemType__DescriptionAssignment_3 ) )
            // InternalStl.g:1104:2: ( rule__ItemType__DescriptionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getDescriptionAssignment_3()); 
            }
            // InternalStl.g:1105:2: ( rule__ItemType__DescriptionAssignment_3 )
            // InternalStl.g:1105:3: rule__ItemType__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ItemType__DescriptionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getDescriptionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__3__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // InternalStl.g:1114:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1118:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalStl.g:1119:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Connector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Connector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0"


    // $ANTLR start "rule__Connector__Group__0__Impl"
    // InternalStl.g:1126:1: rule__Connector__Group__0__Impl : ( ( rule__Connector__EntryAssignment_0 ) ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1130:1: ( ( ( rule__Connector__EntryAssignment_0 ) ) )
            // InternalStl.g:1131:1: ( ( rule__Connector__EntryAssignment_0 ) )
            {
            // InternalStl.g:1131:1: ( ( rule__Connector__EntryAssignment_0 ) )
            // InternalStl.g:1132:2: ( rule__Connector__EntryAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getEntryAssignment_0()); 
            }
            // InternalStl.g:1133:2: ( rule__Connector__EntryAssignment_0 )
            // InternalStl.g:1133:3: rule__Connector__EntryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__EntryAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getEntryAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0__Impl"


    // $ANTLR start "rule__Connector__Group__1"
    // InternalStl.g:1141:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1145:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalStl.g:1146:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Connector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Connector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1"


    // $ANTLR start "rule__Connector__Group__1__Impl"
    // InternalStl.g:1153:1: rule__Connector__Group__1__Impl : ( '>' ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1157:1: ( ( '>' ) )
            // InternalStl.g:1158:1: ( '>' )
            {
            // InternalStl.g:1158:1: ( '>' )
            // InternalStl.g:1159:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getGreaterThanSignKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getGreaterThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1__Impl"


    // $ANTLR start "rule__Connector__Group__2"
    // InternalStl.g:1168:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1172:1: ( rule__Connector__Group__2__Impl )
            // InternalStl.g:1173:2: rule__Connector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2"


    // $ANTLR start "rule__Connector__Group__2__Impl"
    // InternalStl.g:1179:1: rule__Connector__Group__2__Impl : ( ( rule__Connector__ExitAssignment_2 ) ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1183:1: ( ( ( rule__Connector__ExitAssignment_2 ) ) )
            // InternalStl.g:1184:1: ( ( rule__Connector__ExitAssignment_2 ) )
            {
            // InternalStl.g:1184:1: ( ( rule__Connector__ExitAssignment_2 ) )
            // InternalStl.g:1185:2: ( rule__Connector__ExitAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getExitAssignment_2()); 
            }
            // InternalStl.g:1186:2: ( rule__Connector__ExitAssignment_2 )
            // InternalStl.g:1186:3: rule__Connector__ExitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Connector__ExitAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getExitAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2__Impl"


    // $ANTLR start "rule__Service__Group_0__0"
    // InternalStl.g:1195:1: rule__Service__Group_0__0 : rule__Service__Group_0__0__Impl rule__Service__Group_0__1 ;
    public final void rule__Service__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1199:1: ( rule__Service__Group_0__0__Impl rule__Service__Group_0__1 )
            // InternalStl.g:1200:2: rule__Service__Group_0__0__Impl rule__Service__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__0"


    // $ANTLR start "rule__Service__Group_0__0__Impl"
    // InternalStl.g:1207:1: rule__Service__Group_0__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1211:1: ( ( 'service' ) )
            // InternalStl.g:1212:1: ( 'service' )
            {
            // InternalStl.g:1212:1: ( 'service' )
            // InternalStl.g:1213:2: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getServiceKeyword_0_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getServiceKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__0__Impl"


    // $ANTLR start "rule__Service__Group_0__1"
    // InternalStl.g:1222:1: rule__Service__Group_0__1 : rule__Service__Group_0__1__Impl rule__Service__Group_0__2 ;
    public final void rule__Service__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1226:1: ( rule__Service__Group_0__1__Impl rule__Service__Group_0__2 )
            // InternalStl.g:1227:2: rule__Service__Group_0__1__Impl rule__Service__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__Service__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__1"


    // $ANTLR start "rule__Service__Group_0__1__Impl"
    // InternalStl.g:1234:1: rule__Service__Group_0__1__Impl : ( ( rule__Service__NameAssignment_0_1 ) ) ;
    public final void rule__Service__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1238:1: ( ( ( rule__Service__NameAssignment_0_1 ) ) )
            // InternalStl.g:1239:1: ( ( rule__Service__NameAssignment_0_1 ) )
            {
            // InternalStl.g:1239:1: ( ( rule__Service__NameAssignment_0_1 ) )
            // InternalStl.g:1240:2: ( rule__Service__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameAssignment_0_1()); 
            }
            // InternalStl.g:1241:2: ( rule__Service__NameAssignment_0_1 )
            // InternalStl.g:1241:3: rule__Service__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__1__Impl"


    // $ANTLR start "rule__Service__Group_0__2"
    // InternalStl.g:1249:1: rule__Service__Group_0__2 : rule__Service__Group_0__2__Impl rule__Service__Group_0__3 ;
    public final void rule__Service__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1253:1: ( rule__Service__Group_0__2__Impl rule__Service__Group_0__3 )
            // InternalStl.g:1254:2: rule__Service__Group_0__2__Impl rule__Service__Group_0__3
            {
            pushFollow(FOLLOW_15);
            rule__Service__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__2"


    // $ANTLR start "rule__Service__Group_0__2__Impl"
    // InternalStl.g:1261:1: rule__Service__Group_0__2__Impl : ( '(cost=' ) ;
    public final void rule__Service__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1265:1: ( ( '(cost=' ) )
            // InternalStl.g:1266:1: ( '(cost=' )
            {
            // InternalStl.g:1266:1: ( '(cost=' )
            // InternalStl.g:1267:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCostKeyword_0_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCostKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__2__Impl"


    // $ANTLR start "rule__Service__Group_0__3"
    // InternalStl.g:1276:1: rule__Service__Group_0__3 : rule__Service__Group_0__3__Impl rule__Service__Group_0__4 ;
    public final void rule__Service__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1280:1: ( rule__Service__Group_0__3__Impl rule__Service__Group_0__4 )
            // InternalStl.g:1281:2: rule__Service__Group_0__3__Impl rule__Service__Group_0__4
            {
            pushFollow(FOLLOW_16);
            rule__Service__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__3"


    // $ANTLR start "rule__Service__Group_0__3__Impl"
    // InternalStl.g:1288:1: rule__Service__Group_0__3__Impl : ( ( rule__Service__CostAssignment_0_3 ) ) ;
    public final void rule__Service__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1292:1: ( ( ( rule__Service__CostAssignment_0_3 ) ) )
            // InternalStl.g:1293:1: ( ( rule__Service__CostAssignment_0_3 ) )
            {
            // InternalStl.g:1293:1: ( ( rule__Service__CostAssignment_0_3 ) )
            // InternalStl.g:1294:2: ( rule__Service__CostAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCostAssignment_0_3()); 
            }
            // InternalStl.g:1295:2: ( rule__Service__CostAssignment_0_3 )
            // InternalStl.g:1295:3: rule__Service__CostAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Service__CostAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCostAssignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__3__Impl"


    // $ANTLR start "rule__Service__Group_0__4"
    // InternalStl.g:1303:1: rule__Service__Group_0__4 : rule__Service__Group_0__4__Impl rule__Service__Group_0__5 ;
    public final void rule__Service__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1307:1: ( rule__Service__Group_0__4__Impl rule__Service__Group_0__5 )
            // InternalStl.g:1308:2: rule__Service__Group_0__4__Impl rule__Service__Group_0__5
            {
            pushFollow(FOLLOW_17);
            rule__Service__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_0__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__4"


    // $ANTLR start "rule__Service__Group_0__4__Impl"
    // InternalStl.g:1315:1: rule__Service__Group_0__4__Impl : ( ',reliability=' ) ;
    public final void rule__Service__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1319:1: ( ( ',reliability=' ) )
            // InternalStl.g:1320:1: ( ',reliability=' )
            {
            // InternalStl.g:1320:1: ( ',reliability=' )
            // InternalStl.g:1321:2: ',reliability='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getReliabilityKeyword_0_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getReliabilityKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__4__Impl"


    // $ANTLR start "rule__Service__Group_0__5"
    // InternalStl.g:1330:1: rule__Service__Group_0__5 : rule__Service__Group_0__5__Impl rule__Service__Group_0__6 ;
    public final void rule__Service__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1334:1: ( rule__Service__Group_0__5__Impl rule__Service__Group_0__6 )
            // InternalStl.g:1335:2: rule__Service__Group_0__5__Impl rule__Service__Group_0__6
            {
            pushFollow(FOLLOW_18);
            rule__Service__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_0__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__5"


    // $ANTLR start "rule__Service__Group_0__5__Impl"
    // InternalStl.g:1342:1: rule__Service__Group_0__5__Impl : ( ( rule__Service__ReliabilityAssignment_0_5 ) ) ;
    public final void rule__Service__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1346:1: ( ( ( rule__Service__ReliabilityAssignment_0_5 ) ) )
            // InternalStl.g:1347:1: ( ( rule__Service__ReliabilityAssignment_0_5 ) )
            {
            // InternalStl.g:1347:1: ( ( rule__Service__ReliabilityAssignment_0_5 ) )
            // InternalStl.g:1348:2: ( rule__Service__ReliabilityAssignment_0_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getReliabilityAssignment_0_5()); 
            }
            // InternalStl.g:1349:2: ( rule__Service__ReliabilityAssignment_0_5 )
            // InternalStl.g:1349:3: rule__Service__ReliabilityAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__Service__ReliabilityAssignment_0_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getReliabilityAssignment_0_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__5__Impl"


    // $ANTLR start "rule__Service__Group_0__6"
    // InternalStl.g:1357:1: rule__Service__Group_0__6 : rule__Service__Group_0__6__Impl rule__Service__Group_0__7 ;
    public final void rule__Service__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1361:1: ( rule__Service__Group_0__6__Impl rule__Service__Group_0__7 )
            // InternalStl.g:1362:2: rule__Service__Group_0__6__Impl rule__Service__Group_0__7
            {
            pushFollow(FOLLOW_15);
            rule__Service__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_0__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__6"


    // $ANTLR start "rule__Service__Group_0__6__Impl"
    // InternalStl.g:1369:1: rule__Service__Group_0__6__Impl : ( ',processingTime=' ) ;
    public final void rule__Service__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1373:1: ( ( ',processingTime=' ) )
            // InternalStl.g:1374:1: ( ',processingTime=' )
            {
            // InternalStl.g:1374:1: ( ',processingTime=' )
            // InternalStl.g:1375:2: ',processingTime='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getProcessingTimeKeyword_0_6()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getProcessingTimeKeyword_0_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__6__Impl"


    // $ANTLR start "rule__Service__Group_0__7"
    // InternalStl.g:1384:1: rule__Service__Group_0__7 : rule__Service__Group_0__7__Impl rule__Service__Group_0__8 ;
    public final void rule__Service__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1388:1: ( rule__Service__Group_0__7__Impl rule__Service__Group_0__8 )
            // InternalStl.g:1389:2: rule__Service__Group_0__7__Impl rule__Service__Group_0__8
            {
            pushFollow(FOLLOW_19);
            rule__Service__Group_0__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_0__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__7"


    // $ANTLR start "rule__Service__Group_0__7__Impl"
    // InternalStl.g:1396:1: rule__Service__Group_0__7__Impl : ( ( rule__Service__ProcessingTimeAssignment_0_7 ) ) ;
    public final void rule__Service__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1400:1: ( ( ( rule__Service__ProcessingTimeAssignment_0_7 ) ) )
            // InternalStl.g:1401:1: ( ( rule__Service__ProcessingTimeAssignment_0_7 ) )
            {
            // InternalStl.g:1401:1: ( ( rule__Service__ProcessingTimeAssignment_0_7 ) )
            // InternalStl.g:1402:2: ( rule__Service__ProcessingTimeAssignment_0_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getProcessingTimeAssignment_0_7()); 
            }
            // InternalStl.g:1403:2: ( rule__Service__ProcessingTimeAssignment_0_7 )
            // InternalStl.g:1403:3: rule__Service__ProcessingTimeAssignment_0_7
            {
            pushFollow(FOLLOW_2);
            rule__Service__ProcessingTimeAssignment_0_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getProcessingTimeAssignment_0_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__7__Impl"


    // $ANTLR start "rule__Service__Group_0__8"
    // InternalStl.g:1411:1: rule__Service__Group_0__8 : rule__Service__Group_0__8__Impl ;
    public final void rule__Service__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1415:1: ( rule__Service__Group_0__8__Impl )
            // InternalStl.g:1416:2: rule__Service__Group_0__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_0__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__8"


    // $ANTLR start "rule__Service__Group_0__8__Impl"
    // InternalStl.g:1422:1: rule__Service__Group_0__8__Impl : ( ')' ) ;
    public final void rule__Service__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1426:1: ( ( ')' ) )
            // InternalStl.g:1427:1: ( ')' )
            {
            // InternalStl.g:1427:1: ( ')' )
            // InternalStl.g:1428:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_0_8()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRightParenthesisKeyword_0_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_0__8__Impl"


    // $ANTLR start "rule__Service__Group_1__0"
    // InternalStl.g:1438:1: rule__Service__Group_1__0 : rule__Service__Group_1__0__Impl rule__Service__Group_1__1 ;
    public final void rule__Service__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1442:1: ( rule__Service__Group_1__0__Impl rule__Service__Group_1__1 )
            // InternalStl.g:1443:2: rule__Service__Group_1__0__Impl rule__Service__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__0"


    // $ANTLR start "rule__Service__Group_1__0__Impl"
    // InternalStl.g:1450:1: rule__Service__Group_1__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1454:1: ( ( 'service' ) )
            // InternalStl.g:1455:1: ( 'service' )
            {
            // InternalStl.g:1455:1: ( 'service' )
            // InternalStl.g:1456:2: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getServiceKeyword_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getServiceKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__0__Impl"


    // $ANTLR start "rule__Service__Group_1__1"
    // InternalStl.g:1465:1: rule__Service__Group_1__1 : rule__Service__Group_1__1__Impl rule__Service__Group_1__2 ;
    public final void rule__Service__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1469:1: ( rule__Service__Group_1__1__Impl rule__Service__Group_1__2 )
            // InternalStl.g:1470:2: rule__Service__Group_1__1__Impl rule__Service__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Service__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__1"


    // $ANTLR start "rule__Service__Group_1__1__Impl"
    // InternalStl.g:1477:1: rule__Service__Group_1__1__Impl : ( ( rule__Service__NameAssignment_1_1 ) ) ;
    public final void rule__Service__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1481:1: ( ( ( rule__Service__NameAssignment_1_1 ) ) )
            // InternalStl.g:1482:1: ( ( rule__Service__NameAssignment_1_1 ) )
            {
            // InternalStl.g:1482:1: ( ( rule__Service__NameAssignment_1_1 ) )
            // InternalStl.g:1483:2: ( rule__Service__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameAssignment_1_1()); 
            }
            // InternalStl.g:1484:2: ( rule__Service__NameAssignment_1_1 )
            // InternalStl.g:1484:3: rule__Service__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__1__Impl"


    // $ANTLR start "rule__Service__Group_1__2"
    // InternalStl.g:1492:1: rule__Service__Group_1__2 : rule__Service__Group_1__2__Impl rule__Service__Group_1__3 ;
    public final void rule__Service__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1496:1: ( rule__Service__Group_1__2__Impl rule__Service__Group_1__3 )
            // InternalStl.g:1497:2: rule__Service__Group_1__2__Impl rule__Service__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__Service__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__2"


    // $ANTLR start "rule__Service__Group_1__2__Impl"
    // InternalStl.g:1504:1: rule__Service__Group_1__2__Impl : ( '(cost=' ) ;
    public final void rule__Service__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1508:1: ( ( '(cost=' ) )
            // InternalStl.g:1509:1: ( '(cost=' )
            {
            // InternalStl.g:1509:1: ( '(cost=' )
            // InternalStl.g:1510:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCostKeyword_1_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCostKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__2__Impl"


    // $ANTLR start "rule__Service__Group_1__3"
    // InternalStl.g:1519:1: rule__Service__Group_1__3 : rule__Service__Group_1__3__Impl rule__Service__Group_1__4 ;
    public final void rule__Service__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1523:1: ( rule__Service__Group_1__3__Impl rule__Service__Group_1__4 )
            // InternalStl.g:1524:2: rule__Service__Group_1__3__Impl rule__Service__Group_1__4
            {
            pushFollow(FOLLOW_16);
            rule__Service__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__3"


    // $ANTLR start "rule__Service__Group_1__3__Impl"
    // InternalStl.g:1531:1: rule__Service__Group_1__3__Impl : ( ( rule__Service__CostAssignment_1_3 ) ) ;
    public final void rule__Service__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1535:1: ( ( ( rule__Service__CostAssignment_1_3 ) ) )
            // InternalStl.g:1536:1: ( ( rule__Service__CostAssignment_1_3 ) )
            {
            // InternalStl.g:1536:1: ( ( rule__Service__CostAssignment_1_3 ) )
            // InternalStl.g:1537:2: ( rule__Service__CostAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCostAssignment_1_3()); 
            }
            // InternalStl.g:1538:2: ( rule__Service__CostAssignment_1_3 )
            // InternalStl.g:1538:3: rule__Service__CostAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Service__CostAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCostAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__3__Impl"


    // $ANTLR start "rule__Service__Group_1__4"
    // InternalStl.g:1546:1: rule__Service__Group_1__4 : rule__Service__Group_1__4__Impl rule__Service__Group_1__5 ;
    public final void rule__Service__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1550:1: ( rule__Service__Group_1__4__Impl rule__Service__Group_1__5 )
            // InternalStl.g:1551:2: rule__Service__Group_1__4__Impl rule__Service__Group_1__5
            {
            pushFollow(FOLLOW_17);
            rule__Service__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_1__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__4"


    // $ANTLR start "rule__Service__Group_1__4__Impl"
    // InternalStl.g:1558:1: rule__Service__Group_1__4__Impl : ( ',reliability=' ) ;
    public final void rule__Service__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1562:1: ( ( ',reliability=' ) )
            // InternalStl.g:1563:1: ( ',reliability=' )
            {
            // InternalStl.g:1563:1: ( ',reliability=' )
            // InternalStl.g:1564:2: ',reliability='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getReliabilityKeyword_1_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getReliabilityKeyword_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__4__Impl"


    // $ANTLR start "rule__Service__Group_1__5"
    // InternalStl.g:1573:1: rule__Service__Group_1__5 : rule__Service__Group_1__5__Impl rule__Service__Group_1__6 ;
    public final void rule__Service__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1577:1: ( rule__Service__Group_1__5__Impl rule__Service__Group_1__6 )
            // InternalStl.g:1578:2: rule__Service__Group_1__5__Impl rule__Service__Group_1__6
            {
            pushFollow(FOLLOW_18);
            rule__Service__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_1__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__5"


    // $ANTLR start "rule__Service__Group_1__5__Impl"
    // InternalStl.g:1585:1: rule__Service__Group_1__5__Impl : ( ( rule__Service__ReliabilityAssignment_1_5 ) ) ;
    public final void rule__Service__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1589:1: ( ( ( rule__Service__ReliabilityAssignment_1_5 ) ) )
            // InternalStl.g:1590:1: ( ( rule__Service__ReliabilityAssignment_1_5 ) )
            {
            // InternalStl.g:1590:1: ( ( rule__Service__ReliabilityAssignment_1_5 ) )
            // InternalStl.g:1591:2: ( rule__Service__ReliabilityAssignment_1_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getReliabilityAssignment_1_5()); 
            }
            // InternalStl.g:1592:2: ( rule__Service__ReliabilityAssignment_1_5 )
            // InternalStl.g:1592:3: rule__Service__ReliabilityAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__Service__ReliabilityAssignment_1_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getReliabilityAssignment_1_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__5__Impl"


    // $ANTLR start "rule__Service__Group_1__6"
    // InternalStl.g:1600:1: rule__Service__Group_1__6 : rule__Service__Group_1__6__Impl rule__Service__Group_1__7 ;
    public final void rule__Service__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1604:1: ( rule__Service__Group_1__6__Impl rule__Service__Group_1__7 )
            // InternalStl.g:1605:2: rule__Service__Group_1__6__Impl rule__Service__Group_1__7
            {
            pushFollow(FOLLOW_15);
            rule__Service__Group_1__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_1__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__6"


    // $ANTLR start "rule__Service__Group_1__6__Impl"
    // InternalStl.g:1612:1: rule__Service__Group_1__6__Impl : ( ',processingTime=' ) ;
    public final void rule__Service__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1616:1: ( ( ',processingTime=' ) )
            // InternalStl.g:1617:1: ( ',processingTime=' )
            {
            // InternalStl.g:1617:1: ( ',processingTime=' )
            // InternalStl.g:1618:2: ',processingTime='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getProcessingTimeKeyword_1_6()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getProcessingTimeKeyword_1_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__6__Impl"


    // $ANTLR start "rule__Service__Group_1__7"
    // InternalStl.g:1627:1: rule__Service__Group_1__7 : rule__Service__Group_1__7__Impl rule__Service__Group_1__8 ;
    public final void rule__Service__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1631:1: ( rule__Service__Group_1__7__Impl rule__Service__Group_1__8 )
            // InternalStl.g:1632:2: rule__Service__Group_1__7__Impl rule__Service__Group_1__8
            {
            pushFollow(FOLLOW_20);
            rule__Service__Group_1__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_1__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__7"


    // $ANTLR start "rule__Service__Group_1__7__Impl"
    // InternalStl.g:1639:1: rule__Service__Group_1__7__Impl : ( ( rule__Service__ProcessingTimeAssignment_1_7 ) ) ;
    public final void rule__Service__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1643:1: ( ( ( rule__Service__ProcessingTimeAssignment_1_7 ) ) )
            // InternalStl.g:1644:1: ( ( rule__Service__ProcessingTimeAssignment_1_7 ) )
            {
            // InternalStl.g:1644:1: ( ( rule__Service__ProcessingTimeAssignment_1_7 ) )
            // InternalStl.g:1645:2: ( rule__Service__ProcessingTimeAssignment_1_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getProcessingTimeAssignment_1_7()); 
            }
            // InternalStl.g:1646:2: ( rule__Service__ProcessingTimeAssignment_1_7 )
            // InternalStl.g:1646:3: rule__Service__ProcessingTimeAssignment_1_7
            {
            pushFollow(FOLLOW_2);
            rule__Service__ProcessingTimeAssignment_1_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getProcessingTimeAssignment_1_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__7__Impl"


    // $ANTLR start "rule__Service__Group_1__8"
    // InternalStl.g:1654:1: rule__Service__Group_1__8 : rule__Service__Group_1__8__Impl rule__Service__Group_1__9 ;
    public final void rule__Service__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1658:1: ( rule__Service__Group_1__8__Impl rule__Service__Group_1__9 )
            // InternalStl.g:1659:2: rule__Service__Group_1__8__Impl rule__Service__Group_1__9
            {
            pushFollow(FOLLOW_21);
            rule__Service__Group_1__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_1__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__8"


    // $ANTLR start "rule__Service__Group_1__8__Impl"
    // InternalStl.g:1666:1: rule__Service__Group_1__8__Impl : ( '){' ) ;
    public final void rule__Service__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1670:1: ( ( '){' ) )
            // InternalStl.g:1671:1: ( '){' )
            {
            // InternalStl.g:1671:1: ( '){' )
            // InternalStl.g:1672:2: '){'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightParenthesisLeftCurlyBracketKeyword_1_8()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRightParenthesisLeftCurlyBracketKeyword_1_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__8__Impl"


    // $ANTLR start "rule__Service__Group_1__9"
    // InternalStl.g:1681:1: rule__Service__Group_1__9 : rule__Service__Group_1__9__Impl rule__Service__Group_1__10 ;
    public final void rule__Service__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1685:1: ( rule__Service__Group_1__9__Impl rule__Service__Group_1__10 )
            // InternalStl.g:1686:2: rule__Service__Group_1__9__Impl rule__Service__Group_1__10
            {
            pushFollow(FOLLOW_22);
            rule__Service__Group_1__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_1__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__9"


    // $ANTLR start "rule__Service__Group_1__9__Impl"
    // InternalStl.g:1693:1: rule__Service__Group_1__9__Impl : ( ( ( rule__Service__ParametersAssignment_1_9 ) ) ( ( rule__Service__ParametersAssignment_1_9 )* ) ) ;
    public final void rule__Service__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1697:1: ( ( ( ( rule__Service__ParametersAssignment_1_9 ) ) ( ( rule__Service__ParametersAssignment_1_9 )* ) ) )
            // InternalStl.g:1698:1: ( ( ( rule__Service__ParametersAssignment_1_9 ) ) ( ( rule__Service__ParametersAssignment_1_9 )* ) )
            {
            // InternalStl.g:1698:1: ( ( ( rule__Service__ParametersAssignment_1_9 ) ) ( ( rule__Service__ParametersAssignment_1_9 )* ) )
            // InternalStl.g:1699:2: ( ( rule__Service__ParametersAssignment_1_9 ) ) ( ( rule__Service__ParametersAssignment_1_9 )* )
            {
            // InternalStl.g:1699:2: ( ( rule__Service__ParametersAssignment_1_9 ) )
            // InternalStl.g:1700:3: ( rule__Service__ParametersAssignment_1_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getParametersAssignment_1_9()); 
            }
            // InternalStl.g:1701:3: ( rule__Service__ParametersAssignment_1_9 )
            // InternalStl.g:1701:4: rule__Service__ParametersAssignment_1_9
            {
            pushFollow(FOLLOW_23);
            rule__Service__ParametersAssignment_1_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getParametersAssignment_1_9()); 
            }

            }

            // InternalStl.g:1704:2: ( ( rule__Service__ParametersAssignment_1_9 )* )
            // InternalStl.g:1705:3: ( rule__Service__ParametersAssignment_1_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getParametersAssignment_1_9()); 
            }
            // InternalStl.g:1706:3: ( rule__Service__ParametersAssignment_1_9 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalStl.g:1706:4: rule__Service__ParametersAssignment_1_9
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Service__ParametersAssignment_1_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getParametersAssignment_1_9()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__9__Impl"


    // $ANTLR start "rule__Service__Group_1__10"
    // InternalStl.g:1715:1: rule__Service__Group_1__10 : rule__Service__Group_1__10__Impl ;
    public final void rule__Service__Group_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1719:1: ( rule__Service__Group_1__10__Impl )
            // InternalStl.g:1720:2: rule__Service__Group_1__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_1__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__10"


    // $ANTLR start "rule__Service__Group_1__10__Impl"
    // InternalStl.g:1726:1: rule__Service__Group_1__10__Impl : ( '}' ) ;
    public final void rule__Service__Group_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1730:1: ( ( '}' ) )
            // InternalStl.g:1731:1: ( '}' )
            {
            // InternalStl.g:1731:1: ( '}' )
            // InternalStl.g:1732:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_1_10()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_1_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__10__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalStl.g:1742:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1746:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalStl.g:1747:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalStl.g:1754:1: rule__Parameter__Group__0__Impl : ( 'input' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1758:1: ( ( 'input' ) )
            // InternalStl.g:1759:1: ( 'input' )
            {
            // InternalStl.g:1759:1: ( 'input' )
            // InternalStl.g:1760:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getInputKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getInputKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalStl.g:1769:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1773:1: ( rule__Parameter__Group__1__Impl )
            // InternalStl.g:1774:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalStl.g:1780:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1784:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalStl.g:1785:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalStl.g:1785:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalStl.g:1786:2: ( rule__Parameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:1787:2: ( rule__Parameter__NameAssignment_1 )
            // InternalStl.g:1787:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Slot__Group__0"
    // InternalStl.g:1796:1: rule__Slot__Group__0 : rule__Slot__Group__0__Impl rule__Slot__Group__1 ;
    public final void rule__Slot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1800:1: ( rule__Slot__Group__0__Impl rule__Slot__Group__1 )
            // InternalStl.g:1801:2: rule__Slot__Group__0__Impl rule__Slot__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Slot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Slot__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__0"


    // $ANTLR start "rule__Slot__Group__0__Impl"
    // InternalStl.g:1808:1: rule__Slot__Group__0__Impl : ( ( rule__Slot__NameAssignment_0 ) ) ;
    public final void rule__Slot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1812:1: ( ( ( rule__Slot__NameAssignment_0 ) ) )
            // InternalStl.g:1813:1: ( ( rule__Slot__NameAssignment_0 ) )
            {
            // InternalStl.g:1813:1: ( ( rule__Slot__NameAssignment_0 ) )
            // InternalStl.g:1814:2: ( rule__Slot__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getNameAssignment_0()); 
            }
            // InternalStl.g:1815:2: ( rule__Slot__NameAssignment_0 )
            // InternalStl.g:1815:3: rule__Slot__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Slot__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__0__Impl"


    // $ANTLR start "rule__Slot__Group__1"
    // InternalStl.g:1823:1: rule__Slot__Group__1 : rule__Slot__Group__1__Impl rule__Slot__Group__2 ;
    public final void rule__Slot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1827:1: ( rule__Slot__Group__1__Impl rule__Slot__Group__2 )
            // InternalStl.g:1828:2: rule__Slot__Group__1__Impl rule__Slot__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Slot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Slot__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__1"


    // $ANTLR start "rule__Slot__Group__1__Impl"
    // InternalStl.g:1835:1: rule__Slot__Group__1__Impl : ( ':' ) ;
    public final void rule__Slot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1839:1: ( ( ':' ) )
            // InternalStl.g:1840:1: ( ':' )
            {
            // InternalStl.g:1840:1: ( ':' )
            // InternalStl.g:1841:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getColonKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__1__Impl"


    // $ANTLR start "rule__Slot__Group__2"
    // InternalStl.g:1850:1: rule__Slot__Group__2 : rule__Slot__Group__2__Impl ;
    public final void rule__Slot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1854:1: ( rule__Slot__Group__2__Impl )
            // InternalStl.g:1855:2: rule__Slot__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Slot__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__2"


    // $ANTLR start "rule__Slot__Group__2__Impl"
    // InternalStl.g:1861:1: rule__Slot__Group__2__Impl : ( ( rule__Slot__RequiredTypeAssignment_2 ) ) ;
    public final void rule__Slot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1865:1: ( ( ( rule__Slot__RequiredTypeAssignment_2 ) ) )
            // InternalStl.g:1866:1: ( ( rule__Slot__RequiredTypeAssignment_2 ) )
            {
            // InternalStl.g:1866:1: ( ( rule__Slot__RequiredTypeAssignment_2 ) )
            // InternalStl.g:1867:2: ( rule__Slot__RequiredTypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getRequiredTypeAssignment_2()); 
            }
            // InternalStl.g:1868:2: ( rule__Slot__RequiredTypeAssignment_2 )
            // InternalStl.g:1868:3: rule__Slot__RequiredTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Slot__RequiredTypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getRequiredTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__2__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__0"
    // InternalStl.g:1877:1: rule__ItemGenerator__Group__0 : rule__ItemGenerator__Group__0__Impl rule__ItemGenerator__Group__1 ;
    public final void rule__ItemGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1881:1: ( rule__ItemGenerator__Group__0__Impl rule__ItemGenerator__Group__1 )
            // InternalStl.g:1882:2: rule__ItemGenerator__Group__0__Impl rule__ItemGenerator__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ItemGenerator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__0"


    // $ANTLR start "rule__ItemGenerator__Group__0__Impl"
    // InternalStl.g:1889:1: rule__ItemGenerator__Group__0__Impl : ( 'generator' ) ;
    public final void rule__ItemGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1893:1: ( ( 'generator' ) )
            // InternalStl.g:1894:1: ( 'generator' )
            {
            // InternalStl.g:1894:1: ( 'generator' )
            // InternalStl.g:1895:2: 'generator'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratorKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__0__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__1"
    // InternalStl.g:1904:1: rule__ItemGenerator__Group__1 : rule__ItemGenerator__Group__1__Impl rule__ItemGenerator__Group__2 ;
    public final void rule__ItemGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1908:1: ( rule__ItemGenerator__Group__1__Impl rule__ItemGenerator__Group__2 )
            // InternalStl.g:1909:2: rule__ItemGenerator__Group__1__Impl rule__ItemGenerator__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ItemGenerator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__1"


    // $ANTLR start "rule__ItemGenerator__Group__1__Impl"
    // InternalStl.g:1916:1: rule__ItemGenerator__Group__1__Impl : ( ( rule__ItemGenerator__NameAssignment_1 ) ) ;
    public final void rule__ItemGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1920:1: ( ( ( rule__ItemGenerator__NameAssignment_1 ) ) )
            // InternalStl.g:1921:1: ( ( rule__ItemGenerator__NameAssignment_1 ) )
            {
            // InternalStl.g:1921:1: ( ( rule__ItemGenerator__NameAssignment_1 ) )
            // InternalStl.g:1922:2: ( rule__ItemGenerator__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:1923:2: ( rule__ItemGenerator__NameAssignment_1 )
            // InternalStl.g:1923:3: rule__ItemGenerator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__1__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__2"
    // InternalStl.g:1931:1: rule__ItemGenerator__Group__2 : rule__ItemGenerator__Group__2__Impl rule__ItemGenerator__Group__3 ;
    public final void rule__ItemGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1935:1: ( rule__ItemGenerator__Group__2__Impl rule__ItemGenerator__Group__3 )
            // InternalStl.g:1936:2: rule__ItemGenerator__Group__2__Impl rule__ItemGenerator__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ItemGenerator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__2"


    // $ANTLR start "rule__ItemGenerator__Group__2__Impl"
    // InternalStl.g:1943:1: rule__ItemGenerator__Group__2__Impl : ( 'generates' ) ;
    public final void rule__ItemGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1947:1: ( ( 'generates' ) )
            // InternalStl.g:1948:1: ( 'generates' )
            {
            // InternalStl.g:1948:1: ( 'generates' )
            // InternalStl.g:1949:2: 'generates'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratesKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratesKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__2__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__3"
    // InternalStl.g:1958:1: rule__ItemGenerator__Group__3 : rule__ItemGenerator__Group__3__Impl rule__ItemGenerator__Group__4 ;
    public final void rule__ItemGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1962:1: ( rule__ItemGenerator__Group__3__Impl rule__ItemGenerator__Group__4 )
            // InternalStl.g:1963:2: rule__ItemGenerator__Group__3__Impl rule__ItemGenerator__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ItemGenerator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__3"


    // $ANTLR start "rule__ItemGenerator__Group__3__Impl"
    // InternalStl.g:1970:1: rule__ItemGenerator__Group__3__Impl : ( ( rule__ItemGenerator__GeneratedTypeAssignment_3 ) ) ;
    public final void rule__ItemGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1974:1: ( ( ( rule__ItemGenerator__GeneratedTypeAssignment_3 ) ) )
            // InternalStl.g:1975:1: ( ( rule__ItemGenerator__GeneratedTypeAssignment_3 ) )
            {
            // InternalStl.g:1975:1: ( ( rule__ItemGenerator__GeneratedTypeAssignment_3 ) )
            // InternalStl.g:1976:2: ( rule__ItemGenerator__GeneratedTypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratedTypeAssignment_3()); 
            }
            // InternalStl.g:1977:2: ( rule__ItemGenerator__GeneratedTypeAssignment_3 )
            // InternalStl.g:1977:3: rule__ItemGenerator__GeneratedTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__GeneratedTypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratedTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__3__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__4"
    // InternalStl.g:1985:1: rule__ItemGenerator__Group__4 : rule__ItemGenerator__Group__4__Impl rule__ItemGenerator__Group__5 ;
    public final void rule__ItemGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1989:1: ( rule__ItemGenerator__Group__4__Impl rule__ItemGenerator__Group__5 )
            // InternalStl.g:1990:2: rule__ItemGenerator__Group__4__Impl rule__ItemGenerator__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ItemGenerator__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__4"


    // $ANTLR start "rule__ItemGenerator__Group__4__Impl"
    // InternalStl.g:1997:1: rule__ItemGenerator__Group__4__Impl : ( '(cost=' ) ;
    public final void rule__ItemGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2001:1: ( ( '(cost=' ) )
            // InternalStl.g:2002:1: ( '(cost=' )
            {
            // InternalStl.g:2002:1: ( '(cost=' )
            // InternalStl.g:2003:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getCostKeyword_4()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getCostKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__4__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__5"
    // InternalStl.g:2012:1: rule__ItemGenerator__Group__5 : rule__ItemGenerator__Group__5__Impl rule__ItemGenerator__Group__6 ;
    public final void rule__ItemGenerator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2016:1: ( rule__ItemGenerator__Group__5__Impl rule__ItemGenerator__Group__6 )
            // InternalStl.g:2017:2: rule__ItemGenerator__Group__5__Impl rule__ItemGenerator__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__ItemGenerator__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__5"


    // $ANTLR start "rule__ItemGenerator__Group__5__Impl"
    // InternalStl.g:2024:1: rule__ItemGenerator__Group__5__Impl : ( ( rule__ItemGenerator__CostAssignment_5 ) ) ;
    public final void rule__ItemGenerator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2028:1: ( ( ( rule__ItemGenerator__CostAssignment_5 ) ) )
            // InternalStl.g:2029:1: ( ( rule__ItemGenerator__CostAssignment_5 ) )
            {
            // InternalStl.g:2029:1: ( ( rule__ItemGenerator__CostAssignment_5 ) )
            // InternalStl.g:2030:2: ( rule__ItemGenerator__CostAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getCostAssignment_5()); 
            }
            // InternalStl.g:2031:2: ( rule__ItemGenerator__CostAssignment_5 )
            // InternalStl.g:2031:3: rule__ItemGenerator__CostAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__CostAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getCostAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__5__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__6"
    // InternalStl.g:2039:1: rule__ItemGenerator__Group__6 : rule__ItemGenerator__Group__6__Impl rule__ItemGenerator__Group__7 ;
    public final void rule__ItemGenerator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2043:1: ( rule__ItemGenerator__Group__6__Impl rule__ItemGenerator__Group__7 )
            // InternalStl.g:2044:2: rule__ItemGenerator__Group__6__Impl rule__ItemGenerator__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__ItemGenerator__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__6"


    // $ANTLR start "rule__ItemGenerator__Group__6__Impl"
    // InternalStl.g:2051:1: rule__ItemGenerator__Group__6__Impl : ( '){' ) ;
    public final void rule__ItemGenerator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2055:1: ( ( '){' ) )
            // InternalStl.g:2056:1: ( '){' )
            {
            // InternalStl.g:2056:1: ( '){' )
            // InternalStl.g:2057:2: '){'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getRightParenthesisLeftCurlyBracketKeyword_6()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getRightParenthesisLeftCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__6__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__7"
    // InternalStl.g:2066:1: rule__ItemGenerator__Group__7 : rule__ItemGenerator__Group__7__Impl rule__ItemGenerator__Group__8 ;
    public final void rule__ItemGenerator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2070:1: ( rule__ItemGenerator__Group__7__Impl rule__ItemGenerator__Group__8 )
            // InternalStl.g:2071:2: rule__ItemGenerator__Group__7__Impl rule__ItemGenerator__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__ItemGenerator__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__7"


    // $ANTLR start "rule__ItemGenerator__Group__7__Impl"
    // InternalStl.g:2078:1: rule__ItemGenerator__Group__7__Impl : ( 'output' ) ;
    public final void rule__ItemGenerator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2082:1: ( ( 'output' ) )
            // InternalStl.g:2083:1: ( 'output' )
            {
            // InternalStl.g:2083:1: ( 'output' )
            // InternalStl.g:2084:2: 'output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getOutputKeyword_7()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getOutputKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__7__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__8"
    // InternalStl.g:2093:1: rule__ItemGenerator__Group__8 : rule__ItemGenerator__Group__8__Impl rule__ItemGenerator__Group__9 ;
    public final void rule__ItemGenerator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2097:1: ( rule__ItemGenerator__Group__8__Impl rule__ItemGenerator__Group__9 )
            // InternalStl.g:2098:2: rule__ItemGenerator__Group__8__Impl rule__ItemGenerator__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__ItemGenerator__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__8"


    // $ANTLR start "rule__ItemGenerator__Group__8__Impl"
    // InternalStl.g:2105:1: rule__ItemGenerator__Group__8__Impl : ( ( rule__ItemGenerator__OutputSlotsAssignment_8 ) ) ;
    public final void rule__ItemGenerator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2109:1: ( ( ( rule__ItemGenerator__OutputSlotsAssignment_8 ) ) )
            // InternalStl.g:2110:1: ( ( rule__ItemGenerator__OutputSlotsAssignment_8 ) )
            {
            // InternalStl.g:2110:1: ( ( rule__ItemGenerator__OutputSlotsAssignment_8 ) )
            // InternalStl.g:2111:2: ( rule__ItemGenerator__OutputSlotsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getOutputSlotsAssignment_8()); 
            }
            // InternalStl.g:2112:2: ( rule__ItemGenerator__OutputSlotsAssignment_8 )
            // InternalStl.g:2112:3: rule__ItemGenerator__OutputSlotsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__OutputSlotsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getOutputSlotsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__8__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__9"
    // InternalStl.g:2120:1: rule__ItemGenerator__Group__9 : rule__ItemGenerator__Group__9__Impl rule__ItemGenerator__Group__10 ;
    public final void rule__ItemGenerator__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2124:1: ( rule__ItemGenerator__Group__9__Impl rule__ItemGenerator__Group__10 )
            // InternalStl.g:2125:2: rule__ItemGenerator__Group__9__Impl rule__ItemGenerator__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__ItemGenerator__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__9"


    // $ANTLR start "rule__ItemGenerator__Group__9__Impl"
    // InternalStl.g:2132:1: rule__ItemGenerator__Group__9__Impl : ( ( rule__ItemGenerator__ServicesAssignment_9 )* ) ;
    public final void rule__ItemGenerator__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2136:1: ( ( ( rule__ItemGenerator__ServicesAssignment_9 )* ) )
            // InternalStl.g:2137:1: ( ( rule__ItemGenerator__ServicesAssignment_9 )* )
            {
            // InternalStl.g:2137:1: ( ( rule__ItemGenerator__ServicesAssignment_9 )* )
            // InternalStl.g:2138:2: ( rule__ItemGenerator__ServicesAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getServicesAssignment_9()); 
            }
            // InternalStl.g:2139:2: ( rule__ItemGenerator__ServicesAssignment_9 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalStl.g:2139:3: rule__ItemGenerator__ServicesAssignment_9
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__ItemGenerator__ServicesAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getServicesAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__9__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__10"
    // InternalStl.g:2147:1: rule__ItemGenerator__Group__10 : rule__ItemGenerator__Group__10__Impl ;
    public final void rule__ItemGenerator__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2151:1: ( rule__ItemGenerator__Group__10__Impl )
            // InternalStl.g:2152:2: rule__ItemGenerator__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__10"


    // $ANTLR start "rule__ItemGenerator__Group__10__Impl"
    // InternalStl.g:2158:1: rule__ItemGenerator__Group__10__Impl : ( '}' ) ;
    public final void rule__ItemGenerator__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2162:1: ( ( '}' ) )
            // InternalStl.g:2163:1: ( '}' )
            {
            // InternalStl.g:2163:1: ( '}' )
            // InternalStl.g:2164:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__10__Impl"


    // $ANTLR start "rule__ProductStore__Group__0"
    // InternalStl.g:2174:1: rule__ProductStore__Group__0 : rule__ProductStore__Group__0__Impl rule__ProductStore__Group__1 ;
    public final void rule__ProductStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2178:1: ( rule__ProductStore__Group__0__Impl rule__ProductStore__Group__1 )
            // InternalStl.g:2179:2: rule__ProductStore__Group__0__Impl rule__ProductStore__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProductStore__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__0"


    // $ANTLR start "rule__ProductStore__Group__0__Impl"
    // InternalStl.g:2186:1: rule__ProductStore__Group__0__Impl : ( 'productStore' ) ;
    public final void rule__ProductStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2190:1: ( ( 'productStore' ) )
            // InternalStl.g:2191:1: ( 'productStore' )
            {
            // InternalStl.g:2191:1: ( 'productStore' )
            // InternalStl.g:2192:2: 'productStore'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getProductStoreKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getProductStoreKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__0__Impl"


    // $ANTLR start "rule__ProductStore__Group__1"
    // InternalStl.g:2201:1: rule__ProductStore__Group__1 : rule__ProductStore__Group__1__Impl rule__ProductStore__Group__2 ;
    public final void rule__ProductStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2205:1: ( rule__ProductStore__Group__1__Impl rule__ProductStore__Group__2 )
            // InternalStl.g:2206:2: rule__ProductStore__Group__1__Impl rule__ProductStore__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ProductStore__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__1"


    // $ANTLR start "rule__ProductStore__Group__1__Impl"
    // InternalStl.g:2213:1: rule__ProductStore__Group__1__Impl : ( ( rule__ProductStore__NameAssignment_1 ) ) ;
    public final void rule__ProductStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2217:1: ( ( ( rule__ProductStore__NameAssignment_1 ) ) )
            // InternalStl.g:2218:1: ( ( rule__ProductStore__NameAssignment_1 ) )
            {
            // InternalStl.g:2218:1: ( ( rule__ProductStore__NameAssignment_1 ) )
            // InternalStl.g:2219:2: ( rule__ProductStore__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:2220:2: ( rule__ProductStore__NameAssignment_1 )
            // InternalStl.g:2220:3: rule__ProductStore__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__1__Impl"


    // $ANTLR start "rule__ProductStore__Group__2"
    // InternalStl.g:2228:1: rule__ProductStore__Group__2 : rule__ProductStore__Group__2__Impl rule__ProductStore__Group__3 ;
    public final void rule__ProductStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2232:1: ( rule__ProductStore__Group__2__Impl rule__ProductStore__Group__3 )
            // InternalStl.g:2233:2: rule__ProductStore__Group__2__Impl rule__ProductStore__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ProductStore__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__2"


    // $ANTLR start "rule__ProductStore__Group__2__Impl"
    // InternalStl.g:2240:1: rule__ProductStore__Group__2__Impl : ( '(cost=' ) ;
    public final void rule__ProductStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2244:1: ( ( '(cost=' ) )
            // InternalStl.g:2245:1: ( '(cost=' )
            {
            // InternalStl.g:2245:1: ( '(cost=' )
            // InternalStl.g:2246:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getCostKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getCostKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__2__Impl"


    // $ANTLR start "rule__ProductStore__Group__3"
    // InternalStl.g:2255:1: rule__ProductStore__Group__3 : rule__ProductStore__Group__3__Impl rule__ProductStore__Group__4 ;
    public final void rule__ProductStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2259:1: ( rule__ProductStore__Group__3__Impl rule__ProductStore__Group__4 )
            // InternalStl.g:2260:2: rule__ProductStore__Group__3__Impl rule__ProductStore__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__ProductStore__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__3"


    // $ANTLR start "rule__ProductStore__Group__3__Impl"
    // InternalStl.g:2267:1: rule__ProductStore__Group__3__Impl : ( ( rule__ProductStore__CostAssignment_3 ) ) ;
    public final void rule__ProductStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2271:1: ( ( ( rule__ProductStore__CostAssignment_3 ) ) )
            // InternalStl.g:2272:1: ( ( rule__ProductStore__CostAssignment_3 ) )
            {
            // InternalStl.g:2272:1: ( ( rule__ProductStore__CostAssignment_3 ) )
            // InternalStl.g:2273:2: ( rule__ProductStore__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:2274:2: ( rule__ProductStore__CostAssignment_3 )
            // InternalStl.g:2274:3: rule__ProductStore__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getCostAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__3__Impl"


    // $ANTLR start "rule__ProductStore__Group__4"
    // InternalStl.g:2282:1: rule__ProductStore__Group__4 : rule__ProductStore__Group__4__Impl rule__ProductStore__Group__5 ;
    public final void rule__ProductStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2286:1: ( rule__ProductStore__Group__4__Impl rule__ProductStore__Group__5 )
            // InternalStl.g:2287:2: rule__ProductStore__Group__4__Impl rule__ProductStore__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ProductStore__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__4"


    // $ANTLR start "rule__ProductStore__Group__4__Impl"
    // InternalStl.g:2294:1: rule__ProductStore__Group__4__Impl : ( ',capacity=' ) ;
    public final void rule__ProductStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2298:1: ( ( ',capacity=' ) )
            // InternalStl.g:2299:1: ( ',capacity=' )
            {
            // InternalStl.g:2299:1: ( ',capacity=' )
            // InternalStl.g:2300:2: ',capacity='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getCapacityKeyword_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getCapacityKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__4__Impl"


    // $ANTLR start "rule__ProductStore__Group__5"
    // InternalStl.g:2309:1: rule__ProductStore__Group__5 : rule__ProductStore__Group__5__Impl rule__ProductStore__Group__6 ;
    public final void rule__ProductStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2313:1: ( rule__ProductStore__Group__5__Impl rule__ProductStore__Group__6 )
            // InternalStl.g:2314:2: rule__ProductStore__Group__5__Impl rule__ProductStore__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__ProductStore__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__5"


    // $ANTLR start "rule__ProductStore__Group__5__Impl"
    // InternalStl.g:2321:1: rule__ProductStore__Group__5__Impl : ( ( rule__ProductStore__CapacityAssignment_5 ) ) ;
    public final void rule__ProductStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2325:1: ( ( ( rule__ProductStore__CapacityAssignment_5 ) ) )
            // InternalStl.g:2326:1: ( ( rule__ProductStore__CapacityAssignment_5 ) )
            {
            // InternalStl.g:2326:1: ( ( rule__ProductStore__CapacityAssignment_5 ) )
            // InternalStl.g:2327:2: ( rule__ProductStore__CapacityAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getCapacityAssignment_5()); 
            }
            // InternalStl.g:2328:2: ( rule__ProductStore__CapacityAssignment_5 )
            // InternalStl.g:2328:3: rule__ProductStore__CapacityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__CapacityAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getCapacityAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__5__Impl"


    // $ANTLR start "rule__ProductStore__Group__6"
    // InternalStl.g:2336:1: rule__ProductStore__Group__6 : rule__ProductStore__Group__6__Impl rule__ProductStore__Group__7 ;
    public final void rule__ProductStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2340:1: ( rule__ProductStore__Group__6__Impl rule__ProductStore__Group__7 )
            // InternalStl.g:2341:2: rule__ProductStore__Group__6__Impl rule__ProductStore__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__ProductStore__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__6"


    // $ANTLR start "rule__ProductStore__Group__6__Impl"
    // InternalStl.g:2348:1: rule__ProductStore__Group__6__Impl : ( '){' ) ;
    public final void rule__ProductStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2352:1: ( ( '){' ) )
            // InternalStl.g:2353:1: ( '){' )
            {
            // InternalStl.g:2353:1: ( '){' )
            // InternalStl.g:2354:2: '){'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getRightParenthesisLeftCurlyBracketKeyword_6()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getRightParenthesisLeftCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__6__Impl"


    // $ANTLR start "rule__ProductStore__Group__7"
    // InternalStl.g:2363:1: rule__ProductStore__Group__7 : rule__ProductStore__Group__7__Impl rule__ProductStore__Group__8 ;
    public final void rule__ProductStore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2367:1: ( rule__ProductStore__Group__7__Impl rule__ProductStore__Group__8 )
            // InternalStl.g:2368:2: rule__ProductStore__Group__7__Impl rule__ProductStore__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__ProductStore__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__7"


    // $ANTLR start "rule__ProductStore__Group__7__Impl"
    // InternalStl.g:2375:1: rule__ProductStore__Group__7__Impl : ( 'input' ) ;
    public final void rule__ProductStore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2379:1: ( ( 'input' ) )
            // InternalStl.g:2380:1: ( 'input' )
            {
            // InternalStl.g:2380:1: ( 'input' )
            // InternalStl.g:2381:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getInputKeyword_7()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getInputKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__7__Impl"


    // $ANTLR start "rule__ProductStore__Group__8"
    // InternalStl.g:2390:1: rule__ProductStore__Group__8 : rule__ProductStore__Group__8__Impl rule__ProductStore__Group__9 ;
    public final void rule__ProductStore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2394:1: ( rule__ProductStore__Group__8__Impl rule__ProductStore__Group__9 )
            // InternalStl.g:2395:2: rule__ProductStore__Group__8__Impl rule__ProductStore__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__ProductStore__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__8"


    // $ANTLR start "rule__ProductStore__Group__8__Impl"
    // InternalStl.g:2402:1: rule__ProductStore__Group__8__Impl : ( ( rule__ProductStore__InputSlotsAssignment_8 ) ) ;
    public final void rule__ProductStore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2406:1: ( ( ( rule__ProductStore__InputSlotsAssignment_8 ) ) )
            // InternalStl.g:2407:1: ( ( rule__ProductStore__InputSlotsAssignment_8 ) )
            {
            // InternalStl.g:2407:1: ( ( rule__ProductStore__InputSlotsAssignment_8 ) )
            // InternalStl.g:2408:2: ( rule__ProductStore__InputSlotsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getInputSlotsAssignment_8()); 
            }
            // InternalStl.g:2409:2: ( rule__ProductStore__InputSlotsAssignment_8 )
            // InternalStl.g:2409:3: rule__ProductStore__InputSlotsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__InputSlotsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getInputSlotsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__8__Impl"


    // $ANTLR start "rule__ProductStore__Group__9"
    // InternalStl.g:2417:1: rule__ProductStore__Group__9 : rule__ProductStore__Group__9__Impl rule__ProductStore__Group__10 ;
    public final void rule__ProductStore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2421:1: ( rule__ProductStore__Group__9__Impl rule__ProductStore__Group__10 )
            // InternalStl.g:2422:2: rule__ProductStore__Group__9__Impl rule__ProductStore__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__ProductStore__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__9"


    // $ANTLR start "rule__ProductStore__Group__9__Impl"
    // InternalStl.g:2429:1: rule__ProductStore__Group__9__Impl : ( ( rule__ProductStore__ServicesAssignment_9 )* ) ;
    public final void rule__ProductStore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2433:1: ( ( ( rule__ProductStore__ServicesAssignment_9 )* ) )
            // InternalStl.g:2434:1: ( ( rule__ProductStore__ServicesAssignment_9 )* )
            {
            // InternalStl.g:2434:1: ( ( rule__ProductStore__ServicesAssignment_9 )* )
            // InternalStl.g:2435:2: ( rule__ProductStore__ServicesAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getServicesAssignment_9()); 
            }
            // InternalStl.g:2436:2: ( rule__ProductStore__ServicesAssignment_9 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalStl.g:2436:3: rule__ProductStore__ServicesAssignment_9
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__ProductStore__ServicesAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getServicesAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__9__Impl"


    // $ANTLR start "rule__ProductStore__Group__10"
    // InternalStl.g:2444:1: rule__ProductStore__Group__10 : rule__ProductStore__Group__10__Impl ;
    public final void rule__ProductStore__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2448:1: ( rule__ProductStore__Group__10__Impl )
            // InternalStl.g:2449:2: rule__ProductStore__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__10"


    // $ANTLR start "rule__ProductStore__Group__10__Impl"
    // InternalStl.g:2455:1: rule__ProductStore__Group__10__Impl : ( '}' ) ;
    public final void rule__ProductStore__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2459:1: ( ( '}' ) )
            // InternalStl.g:2460:1: ( '}' )
            {
            // InternalStl.g:2460:1: ( '}' )
            // InternalStl.g:2461:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__10__Impl"


    // $ANTLR start "rule__WasteStore__Group__0"
    // InternalStl.g:2471:1: rule__WasteStore__Group__0 : rule__WasteStore__Group__0__Impl rule__WasteStore__Group__1 ;
    public final void rule__WasteStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2475:1: ( rule__WasteStore__Group__0__Impl rule__WasteStore__Group__1 )
            // InternalStl.g:2476:2: rule__WasteStore__Group__0__Impl rule__WasteStore__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WasteStore__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__0"


    // $ANTLR start "rule__WasteStore__Group__0__Impl"
    // InternalStl.g:2483:1: rule__WasteStore__Group__0__Impl : ( 'wasteStore' ) ;
    public final void rule__WasteStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2487:1: ( ( 'wasteStore' ) )
            // InternalStl.g:2488:1: ( 'wasteStore' )
            {
            // InternalStl.g:2488:1: ( 'wasteStore' )
            // InternalStl.g:2489:2: 'wasteStore'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getWasteStoreKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getWasteStoreKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__0__Impl"


    // $ANTLR start "rule__WasteStore__Group__1"
    // InternalStl.g:2498:1: rule__WasteStore__Group__1 : rule__WasteStore__Group__1__Impl rule__WasteStore__Group__2 ;
    public final void rule__WasteStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2502:1: ( rule__WasteStore__Group__1__Impl rule__WasteStore__Group__2 )
            // InternalStl.g:2503:2: rule__WasteStore__Group__1__Impl rule__WasteStore__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__WasteStore__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__1"


    // $ANTLR start "rule__WasteStore__Group__1__Impl"
    // InternalStl.g:2510:1: rule__WasteStore__Group__1__Impl : ( ( rule__WasteStore__NameAssignment_1 ) ) ;
    public final void rule__WasteStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2514:1: ( ( ( rule__WasteStore__NameAssignment_1 ) ) )
            // InternalStl.g:2515:1: ( ( rule__WasteStore__NameAssignment_1 ) )
            {
            // InternalStl.g:2515:1: ( ( rule__WasteStore__NameAssignment_1 ) )
            // InternalStl.g:2516:2: ( rule__WasteStore__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:2517:2: ( rule__WasteStore__NameAssignment_1 )
            // InternalStl.g:2517:3: rule__WasteStore__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__1__Impl"


    // $ANTLR start "rule__WasteStore__Group__2"
    // InternalStl.g:2525:1: rule__WasteStore__Group__2 : rule__WasteStore__Group__2__Impl rule__WasteStore__Group__3 ;
    public final void rule__WasteStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2529:1: ( rule__WasteStore__Group__2__Impl rule__WasteStore__Group__3 )
            // InternalStl.g:2530:2: rule__WasteStore__Group__2__Impl rule__WasteStore__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__WasteStore__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__2"


    // $ANTLR start "rule__WasteStore__Group__2__Impl"
    // InternalStl.g:2537:1: rule__WasteStore__Group__2__Impl : ( '(cost=' ) ;
    public final void rule__WasteStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2541:1: ( ( '(cost=' ) )
            // InternalStl.g:2542:1: ( '(cost=' )
            {
            // InternalStl.g:2542:1: ( '(cost=' )
            // InternalStl.g:2543:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getCostKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getCostKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__2__Impl"


    // $ANTLR start "rule__WasteStore__Group__3"
    // InternalStl.g:2552:1: rule__WasteStore__Group__3 : rule__WasteStore__Group__3__Impl rule__WasteStore__Group__4 ;
    public final void rule__WasteStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2556:1: ( rule__WasteStore__Group__3__Impl rule__WasteStore__Group__4 )
            // InternalStl.g:2557:2: rule__WasteStore__Group__3__Impl rule__WasteStore__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__WasteStore__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__3"


    // $ANTLR start "rule__WasteStore__Group__3__Impl"
    // InternalStl.g:2564:1: rule__WasteStore__Group__3__Impl : ( ( rule__WasteStore__CostAssignment_3 ) ) ;
    public final void rule__WasteStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2568:1: ( ( ( rule__WasteStore__CostAssignment_3 ) ) )
            // InternalStl.g:2569:1: ( ( rule__WasteStore__CostAssignment_3 ) )
            {
            // InternalStl.g:2569:1: ( ( rule__WasteStore__CostAssignment_3 ) )
            // InternalStl.g:2570:2: ( rule__WasteStore__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:2571:2: ( rule__WasteStore__CostAssignment_3 )
            // InternalStl.g:2571:3: rule__WasteStore__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getCostAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__3__Impl"


    // $ANTLR start "rule__WasteStore__Group__4"
    // InternalStl.g:2579:1: rule__WasteStore__Group__4 : rule__WasteStore__Group__4__Impl rule__WasteStore__Group__5 ;
    public final void rule__WasteStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2583:1: ( rule__WasteStore__Group__4__Impl rule__WasteStore__Group__5 )
            // InternalStl.g:2584:2: rule__WasteStore__Group__4__Impl rule__WasteStore__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__WasteStore__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__4"


    // $ANTLR start "rule__WasteStore__Group__4__Impl"
    // InternalStl.g:2591:1: rule__WasteStore__Group__4__Impl : ( ',capacity=' ) ;
    public final void rule__WasteStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2595:1: ( ( ',capacity=' ) )
            // InternalStl.g:2596:1: ( ',capacity=' )
            {
            // InternalStl.g:2596:1: ( ',capacity=' )
            // InternalStl.g:2597:2: ',capacity='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getCapacityKeyword_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getCapacityKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__4__Impl"


    // $ANTLR start "rule__WasteStore__Group__5"
    // InternalStl.g:2606:1: rule__WasteStore__Group__5 : rule__WasteStore__Group__5__Impl rule__WasteStore__Group__6 ;
    public final void rule__WasteStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2610:1: ( rule__WasteStore__Group__5__Impl rule__WasteStore__Group__6 )
            // InternalStl.g:2611:2: rule__WasteStore__Group__5__Impl rule__WasteStore__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__WasteStore__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__5"


    // $ANTLR start "rule__WasteStore__Group__5__Impl"
    // InternalStl.g:2618:1: rule__WasteStore__Group__5__Impl : ( ( rule__WasteStore__CapacityAssignment_5 ) ) ;
    public final void rule__WasteStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2622:1: ( ( ( rule__WasteStore__CapacityAssignment_5 ) ) )
            // InternalStl.g:2623:1: ( ( rule__WasteStore__CapacityAssignment_5 ) )
            {
            // InternalStl.g:2623:1: ( ( rule__WasteStore__CapacityAssignment_5 ) )
            // InternalStl.g:2624:2: ( rule__WasteStore__CapacityAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getCapacityAssignment_5()); 
            }
            // InternalStl.g:2625:2: ( rule__WasteStore__CapacityAssignment_5 )
            // InternalStl.g:2625:3: rule__WasteStore__CapacityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__CapacityAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getCapacityAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__5__Impl"


    // $ANTLR start "rule__WasteStore__Group__6"
    // InternalStl.g:2633:1: rule__WasteStore__Group__6 : rule__WasteStore__Group__6__Impl rule__WasteStore__Group__7 ;
    public final void rule__WasteStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2637:1: ( rule__WasteStore__Group__6__Impl rule__WasteStore__Group__7 )
            // InternalStl.g:2638:2: rule__WasteStore__Group__6__Impl rule__WasteStore__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__WasteStore__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__6"


    // $ANTLR start "rule__WasteStore__Group__6__Impl"
    // InternalStl.g:2645:1: rule__WasteStore__Group__6__Impl : ( '){' ) ;
    public final void rule__WasteStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2649:1: ( ( '){' ) )
            // InternalStl.g:2650:1: ( '){' )
            {
            // InternalStl.g:2650:1: ( '){' )
            // InternalStl.g:2651:2: '){'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getRightParenthesisLeftCurlyBracketKeyword_6()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getRightParenthesisLeftCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__6__Impl"


    // $ANTLR start "rule__WasteStore__Group__7"
    // InternalStl.g:2660:1: rule__WasteStore__Group__7 : rule__WasteStore__Group__7__Impl rule__WasteStore__Group__8 ;
    public final void rule__WasteStore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2664:1: ( rule__WasteStore__Group__7__Impl rule__WasteStore__Group__8 )
            // InternalStl.g:2665:2: rule__WasteStore__Group__7__Impl rule__WasteStore__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__WasteStore__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__7"


    // $ANTLR start "rule__WasteStore__Group__7__Impl"
    // InternalStl.g:2672:1: rule__WasteStore__Group__7__Impl : ( 'input' ) ;
    public final void rule__WasteStore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2676:1: ( ( 'input' ) )
            // InternalStl.g:2677:1: ( 'input' )
            {
            // InternalStl.g:2677:1: ( 'input' )
            // InternalStl.g:2678:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getInputKeyword_7()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getInputKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__7__Impl"


    // $ANTLR start "rule__WasteStore__Group__8"
    // InternalStl.g:2687:1: rule__WasteStore__Group__8 : rule__WasteStore__Group__8__Impl rule__WasteStore__Group__9 ;
    public final void rule__WasteStore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2691:1: ( rule__WasteStore__Group__8__Impl rule__WasteStore__Group__9 )
            // InternalStl.g:2692:2: rule__WasteStore__Group__8__Impl rule__WasteStore__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__WasteStore__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__8"


    // $ANTLR start "rule__WasteStore__Group__8__Impl"
    // InternalStl.g:2699:1: rule__WasteStore__Group__8__Impl : ( ( rule__WasteStore__InputSlotsAssignment_8 ) ) ;
    public final void rule__WasteStore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2703:1: ( ( ( rule__WasteStore__InputSlotsAssignment_8 ) ) )
            // InternalStl.g:2704:1: ( ( rule__WasteStore__InputSlotsAssignment_8 ) )
            {
            // InternalStl.g:2704:1: ( ( rule__WasteStore__InputSlotsAssignment_8 ) )
            // InternalStl.g:2705:2: ( rule__WasteStore__InputSlotsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getInputSlotsAssignment_8()); 
            }
            // InternalStl.g:2706:2: ( rule__WasteStore__InputSlotsAssignment_8 )
            // InternalStl.g:2706:3: rule__WasteStore__InputSlotsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__InputSlotsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getInputSlotsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__8__Impl"


    // $ANTLR start "rule__WasteStore__Group__9"
    // InternalStl.g:2714:1: rule__WasteStore__Group__9 : rule__WasteStore__Group__9__Impl rule__WasteStore__Group__10 ;
    public final void rule__WasteStore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2718:1: ( rule__WasteStore__Group__9__Impl rule__WasteStore__Group__10 )
            // InternalStl.g:2719:2: rule__WasteStore__Group__9__Impl rule__WasteStore__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__WasteStore__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__9"


    // $ANTLR start "rule__WasteStore__Group__9__Impl"
    // InternalStl.g:2726:1: rule__WasteStore__Group__9__Impl : ( ( rule__WasteStore__ServicesAssignment_9 )* ) ;
    public final void rule__WasteStore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2730:1: ( ( ( rule__WasteStore__ServicesAssignment_9 )* ) )
            // InternalStl.g:2731:1: ( ( rule__WasteStore__ServicesAssignment_9 )* )
            {
            // InternalStl.g:2731:1: ( ( rule__WasteStore__ServicesAssignment_9 )* )
            // InternalStl.g:2732:2: ( rule__WasteStore__ServicesAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getServicesAssignment_9()); 
            }
            // InternalStl.g:2733:2: ( rule__WasteStore__ServicesAssignment_9 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalStl.g:2733:3: rule__WasteStore__ServicesAssignment_9
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__WasteStore__ServicesAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getServicesAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__9__Impl"


    // $ANTLR start "rule__WasteStore__Group__10"
    // InternalStl.g:2741:1: rule__WasteStore__Group__10 : rule__WasteStore__Group__10__Impl ;
    public final void rule__WasteStore__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2745:1: ( rule__WasteStore__Group__10__Impl )
            // InternalStl.g:2746:2: rule__WasteStore__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__10"


    // $ANTLR start "rule__WasteStore__Group__10__Impl"
    // InternalStl.g:2752:1: rule__WasteStore__Group__10__Impl : ( '}' ) ;
    public final void rule__WasteStore__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2756:1: ( ( '}' ) )
            // InternalStl.g:2757:1: ( '}' )
            {
            // InternalStl.g:2757:1: ( '}' )
            // InternalStl.g:2758:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__10__Impl"


    // $ANTLR start "rule__Buffer__Group__0"
    // InternalStl.g:2768:1: rule__Buffer__Group__0 : rule__Buffer__Group__0__Impl rule__Buffer__Group__1 ;
    public final void rule__Buffer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2772:1: ( rule__Buffer__Group__0__Impl rule__Buffer__Group__1 )
            // InternalStl.g:2773:2: rule__Buffer__Group__0__Impl rule__Buffer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Buffer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__0"


    // $ANTLR start "rule__Buffer__Group__0__Impl"
    // InternalStl.g:2780:1: rule__Buffer__Group__0__Impl : ( 'buffer' ) ;
    public final void rule__Buffer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2784:1: ( ( 'buffer' ) )
            // InternalStl.g:2785:1: ( 'buffer' )
            {
            // InternalStl.g:2785:1: ( 'buffer' )
            // InternalStl.g:2786:2: 'buffer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getBufferKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getBufferKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__0__Impl"


    // $ANTLR start "rule__Buffer__Group__1"
    // InternalStl.g:2795:1: rule__Buffer__Group__1 : rule__Buffer__Group__1__Impl rule__Buffer__Group__2 ;
    public final void rule__Buffer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2799:1: ( rule__Buffer__Group__1__Impl rule__Buffer__Group__2 )
            // InternalStl.g:2800:2: rule__Buffer__Group__1__Impl rule__Buffer__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Buffer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__1"


    // $ANTLR start "rule__Buffer__Group__1__Impl"
    // InternalStl.g:2807:1: rule__Buffer__Group__1__Impl : ( ( rule__Buffer__NameAssignment_1 ) ) ;
    public final void rule__Buffer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2811:1: ( ( ( rule__Buffer__NameAssignment_1 ) ) )
            // InternalStl.g:2812:1: ( ( rule__Buffer__NameAssignment_1 ) )
            {
            // InternalStl.g:2812:1: ( ( rule__Buffer__NameAssignment_1 ) )
            // InternalStl.g:2813:2: ( rule__Buffer__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:2814:2: ( rule__Buffer__NameAssignment_1 )
            // InternalStl.g:2814:3: rule__Buffer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__1__Impl"


    // $ANTLR start "rule__Buffer__Group__2"
    // InternalStl.g:2822:1: rule__Buffer__Group__2 : rule__Buffer__Group__2__Impl rule__Buffer__Group__3 ;
    public final void rule__Buffer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2826:1: ( rule__Buffer__Group__2__Impl rule__Buffer__Group__3 )
            // InternalStl.g:2827:2: rule__Buffer__Group__2__Impl rule__Buffer__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Buffer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__2"


    // $ANTLR start "rule__Buffer__Group__2__Impl"
    // InternalStl.g:2834:1: rule__Buffer__Group__2__Impl : ( '(cost=' ) ;
    public final void rule__Buffer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2838:1: ( ( '(cost=' ) )
            // InternalStl.g:2839:1: ( '(cost=' )
            {
            // InternalStl.g:2839:1: ( '(cost=' )
            // InternalStl.g:2840:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getCostKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getCostKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__2__Impl"


    // $ANTLR start "rule__Buffer__Group__3"
    // InternalStl.g:2849:1: rule__Buffer__Group__3 : rule__Buffer__Group__3__Impl rule__Buffer__Group__4 ;
    public final void rule__Buffer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2853:1: ( rule__Buffer__Group__3__Impl rule__Buffer__Group__4 )
            // InternalStl.g:2854:2: rule__Buffer__Group__3__Impl rule__Buffer__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Buffer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__3"


    // $ANTLR start "rule__Buffer__Group__3__Impl"
    // InternalStl.g:2861:1: rule__Buffer__Group__3__Impl : ( ( rule__Buffer__CostAssignment_3 ) ) ;
    public final void rule__Buffer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2865:1: ( ( ( rule__Buffer__CostAssignment_3 ) ) )
            // InternalStl.g:2866:1: ( ( rule__Buffer__CostAssignment_3 ) )
            {
            // InternalStl.g:2866:1: ( ( rule__Buffer__CostAssignment_3 ) )
            // InternalStl.g:2867:2: ( rule__Buffer__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:2868:2: ( rule__Buffer__CostAssignment_3 )
            // InternalStl.g:2868:3: rule__Buffer__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getCostAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__3__Impl"


    // $ANTLR start "rule__Buffer__Group__4"
    // InternalStl.g:2876:1: rule__Buffer__Group__4 : rule__Buffer__Group__4__Impl rule__Buffer__Group__5 ;
    public final void rule__Buffer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2880:1: ( rule__Buffer__Group__4__Impl rule__Buffer__Group__5 )
            // InternalStl.g:2881:2: rule__Buffer__Group__4__Impl rule__Buffer__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Buffer__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__4"


    // $ANTLR start "rule__Buffer__Group__4__Impl"
    // InternalStl.g:2888:1: rule__Buffer__Group__4__Impl : ( '){' ) ;
    public final void rule__Buffer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2892:1: ( ( '){' ) )
            // InternalStl.g:2893:1: ( '){' )
            {
            // InternalStl.g:2893:1: ( '){' )
            // InternalStl.g:2894:2: '){'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getRightParenthesisLeftCurlyBracketKeyword_4()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getRightParenthesisLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__4__Impl"


    // $ANTLR start "rule__Buffer__Group__5"
    // InternalStl.g:2903:1: rule__Buffer__Group__5 : rule__Buffer__Group__5__Impl rule__Buffer__Group__6 ;
    public final void rule__Buffer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2907:1: ( rule__Buffer__Group__5__Impl rule__Buffer__Group__6 )
            // InternalStl.g:2908:2: rule__Buffer__Group__5__Impl rule__Buffer__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Buffer__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__5"


    // $ANTLR start "rule__Buffer__Group__5__Impl"
    // InternalStl.g:2915:1: rule__Buffer__Group__5__Impl : ( 'input' ) ;
    public final void rule__Buffer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2919:1: ( ( 'input' ) )
            // InternalStl.g:2920:1: ( 'input' )
            {
            // InternalStl.g:2920:1: ( 'input' )
            // InternalStl.g:2921:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getInputKeyword_5()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getInputKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__5__Impl"


    // $ANTLR start "rule__Buffer__Group__6"
    // InternalStl.g:2930:1: rule__Buffer__Group__6 : rule__Buffer__Group__6__Impl rule__Buffer__Group__7 ;
    public final void rule__Buffer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2934:1: ( rule__Buffer__Group__6__Impl rule__Buffer__Group__7 )
            // InternalStl.g:2935:2: rule__Buffer__Group__6__Impl rule__Buffer__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Buffer__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__6"


    // $ANTLR start "rule__Buffer__Group__6__Impl"
    // InternalStl.g:2942:1: rule__Buffer__Group__6__Impl : ( ( rule__Buffer__InputSlotsAssignment_6 ) ) ;
    public final void rule__Buffer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2946:1: ( ( ( rule__Buffer__InputSlotsAssignment_6 ) ) )
            // InternalStl.g:2947:1: ( ( rule__Buffer__InputSlotsAssignment_6 ) )
            {
            // InternalStl.g:2947:1: ( ( rule__Buffer__InputSlotsAssignment_6 ) )
            // InternalStl.g:2948:2: ( rule__Buffer__InputSlotsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getInputSlotsAssignment_6()); 
            }
            // InternalStl.g:2949:2: ( rule__Buffer__InputSlotsAssignment_6 )
            // InternalStl.g:2949:3: rule__Buffer__InputSlotsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__InputSlotsAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getInputSlotsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__6__Impl"


    // $ANTLR start "rule__Buffer__Group__7"
    // InternalStl.g:2957:1: rule__Buffer__Group__7 : rule__Buffer__Group__7__Impl rule__Buffer__Group__8 ;
    public final void rule__Buffer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2961:1: ( rule__Buffer__Group__7__Impl rule__Buffer__Group__8 )
            // InternalStl.g:2962:2: rule__Buffer__Group__7__Impl rule__Buffer__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__Buffer__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__7"


    // $ANTLR start "rule__Buffer__Group__7__Impl"
    // InternalStl.g:2969:1: rule__Buffer__Group__7__Impl : ( 'output' ) ;
    public final void rule__Buffer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2973:1: ( ( 'output' ) )
            // InternalStl.g:2974:1: ( 'output' )
            {
            // InternalStl.g:2974:1: ( 'output' )
            // InternalStl.g:2975:2: 'output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getOutputKeyword_7()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getOutputKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__7__Impl"


    // $ANTLR start "rule__Buffer__Group__8"
    // InternalStl.g:2984:1: rule__Buffer__Group__8 : rule__Buffer__Group__8__Impl rule__Buffer__Group__9 ;
    public final void rule__Buffer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2988:1: ( rule__Buffer__Group__8__Impl rule__Buffer__Group__9 )
            // InternalStl.g:2989:2: rule__Buffer__Group__8__Impl rule__Buffer__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Buffer__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__8"


    // $ANTLR start "rule__Buffer__Group__8__Impl"
    // InternalStl.g:2996:1: rule__Buffer__Group__8__Impl : ( ( rule__Buffer__OutputSlotsAssignment_8 ) ) ;
    public final void rule__Buffer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3000:1: ( ( ( rule__Buffer__OutputSlotsAssignment_8 ) ) )
            // InternalStl.g:3001:1: ( ( rule__Buffer__OutputSlotsAssignment_8 ) )
            {
            // InternalStl.g:3001:1: ( ( rule__Buffer__OutputSlotsAssignment_8 ) )
            // InternalStl.g:3002:2: ( rule__Buffer__OutputSlotsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getOutputSlotsAssignment_8()); 
            }
            // InternalStl.g:3003:2: ( rule__Buffer__OutputSlotsAssignment_8 )
            // InternalStl.g:3003:3: rule__Buffer__OutputSlotsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__OutputSlotsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getOutputSlotsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__8__Impl"


    // $ANTLR start "rule__Buffer__Group__9"
    // InternalStl.g:3011:1: rule__Buffer__Group__9 : rule__Buffer__Group__9__Impl rule__Buffer__Group__10 ;
    public final void rule__Buffer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3015:1: ( rule__Buffer__Group__9__Impl rule__Buffer__Group__10 )
            // InternalStl.g:3016:2: rule__Buffer__Group__9__Impl rule__Buffer__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__Buffer__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__9"


    // $ANTLR start "rule__Buffer__Group__9__Impl"
    // InternalStl.g:3023:1: rule__Buffer__Group__9__Impl : ( ( rule__Buffer__ServicesAssignment_9 )* ) ;
    public final void rule__Buffer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3027:1: ( ( ( rule__Buffer__ServicesAssignment_9 )* ) )
            // InternalStl.g:3028:1: ( ( rule__Buffer__ServicesAssignment_9 )* )
            {
            // InternalStl.g:3028:1: ( ( rule__Buffer__ServicesAssignment_9 )* )
            // InternalStl.g:3029:2: ( rule__Buffer__ServicesAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getServicesAssignment_9()); 
            }
            // InternalStl.g:3030:2: ( rule__Buffer__ServicesAssignment_9 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalStl.g:3030:3: rule__Buffer__ServicesAssignment_9
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Buffer__ServicesAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getServicesAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__9__Impl"


    // $ANTLR start "rule__Buffer__Group__10"
    // InternalStl.g:3038:1: rule__Buffer__Group__10 : rule__Buffer__Group__10__Impl ;
    public final void rule__Buffer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3042:1: ( rule__Buffer__Group__10__Impl )
            // InternalStl.g:3043:2: rule__Buffer__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__10"


    // $ANTLR start "rule__Buffer__Group__10__Impl"
    // InternalStl.g:3049:1: rule__Buffer__Group__10__Impl : ( '}' ) ;
    public final void rule__Buffer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3053:1: ( ( '}' ) )
            // InternalStl.g:3054:1: ( '}' )
            {
            // InternalStl.g:3054:1: ( '}' )
            // InternalStl.g:3055:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__10__Impl"


    // $ANTLR start "rule__Conveyor__Group__0"
    // InternalStl.g:3065:1: rule__Conveyor__Group__0 : rule__Conveyor__Group__0__Impl rule__Conveyor__Group__1 ;
    public final void rule__Conveyor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3069:1: ( rule__Conveyor__Group__0__Impl rule__Conveyor__Group__1 )
            // InternalStl.g:3070:2: rule__Conveyor__Group__0__Impl rule__Conveyor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Conveyor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__0"


    // $ANTLR start "rule__Conveyor__Group__0__Impl"
    // InternalStl.g:3077:1: rule__Conveyor__Group__0__Impl : ( 'conveyor' ) ;
    public final void rule__Conveyor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3081:1: ( ( 'conveyor' ) )
            // InternalStl.g:3082:1: ( 'conveyor' )
            {
            // InternalStl.g:3082:1: ( 'conveyor' )
            // InternalStl.g:3083:2: 'conveyor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getConveyorKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getConveyorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__0__Impl"


    // $ANTLR start "rule__Conveyor__Group__1"
    // InternalStl.g:3092:1: rule__Conveyor__Group__1 : rule__Conveyor__Group__1__Impl rule__Conveyor__Group__2 ;
    public final void rule__Conveyor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3096:1: ( rule__Conveyor__Group__1__Impl rule__Conveyor__Group__2 )
            // InternalStl.g:3097:2: rule__Conveyor__Group__1__Impl rule__Conveyor__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Conveyor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__1"


    // $ANTLR start "rule__Conveyor__Group__1__Impl"
    // InternalStl.g:3104:1: rule__Conveyor__Group__1__Impl : ( ( rule__Conveyor__NameAssignment_1 ) ) ;
    public final void rule__Conveyor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3108:1: ( ( ( rule__Conveyor__NameAssignment_1 ) ) )
            // InternalStl.g:3109:1: ( ( rule__Conveyor__NameAssignment_1 ) )
            {
            // InternalStl.g:3109:1: ( ( rule__Conveyor__NameAssignment_1 ) )
            // InternalStl.g:3110:2: ( rule__Conveyor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:3111:2: ( rule__Conveyor__NameAssignment_1 )
            // InternalStl.g:3111:3: rule__Conveyor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__1__Impl"


    // $ANTLR start "rule__Conveyor__Group__2"
    // InternalStl.g:3119:1: rule__Conveyor__Group__2 : rule__Conveyor__Group__2__Impl rule__Conveyor__Group__3 ;
    public final void rule__Conveyor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3123:1: ( rule__Conveyor__Group__2__Impl rule__Conveyor__Group__3 )
            // InternalStl.g:3124:2: rule__Conveyor__Group__2__Impl rule__Conveyor__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Conveyor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__2"


    // $ANTLR start "rule__Conveyor__Group__2__Impl"
    // InternalStl.g:3131:1: rule__Conveyor__Group__2__Impl : ( '(cost=' ) ;
    public final void rule__Conveyor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3135:1: ( ( '(cost=' ) )
            // InternalStl.g:3136:1: ( '(cost=' )
            {
            // InternalStl.g:3136:1: ( '(cost=' )
            // InternalStl.g:3137:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getCostKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getCostKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__2__Impl"


    // $ANTLR start "rule__Conveyor__Group__3"
    // InternalStl.g:3146:1: rule__Conveyor__Group__3 : rule__Conveyor__Group__3__Impl rule__Conveyor__Group__4 ;
    public final void rule__Conveyor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3150:1: ( rule__Conveyor__Group__3__Impl rule__Conveyor__Group__4 )
            // InternalStl.g:3151:2: rule__Conveyor__Group__3__Impl rule__Conveyor__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Conveyor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__3"


    // $ANTLR start "rule__Conveyor__Group__3__Impl"
    // InternalStl.g:3158:1: rule__Conveyor__Group__3__Impl : ( ( rule__Conveyor__CostAssignment_3 ) ) ;
    public final void rule__Conveyor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3162:1: ( ( ( rule__Conveyor__CostAssignment_3 ) ) )
            // InternalStl.g:3163:1: ( ( rule__Conveyor__CostAssignment_3 ) )
            {
            // InternalStl.g:3163:1: ( ( rule__Conveyor__CostAssignment_3 ) )
            // InternalStl.g:3164:2: ( rule__Conveyor__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:3165:2: ( rule__Conveyor__CostAssignment_3 )
            // InternalStl.g:3165:3: rule__Conveyor__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getCostAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__3__Impl"


    // $ANTLR start "rule__Conveyor__Group__4"
    // InternalStl.g:3173:1: rule__Conveyor__Group__4 : rule__Conveyor__Group__4__Impl rule__Conveyor__Group__5 ;
    public final void rule__Conveyor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3177:1: ( rule__Conveyor__Group__4__Impl rule__Conveyor__Group__5 )
            // InternalStl.g:3178:2: rule__Conveyor__Group__4__Impl rule__Conveyor__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Conveyor__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__4"


    // $ANTLR start "rule__Conveyor__Group__4__Impl"
    // InternalStl.g:3185:1: rule__Conveyor__Group__4__Impl : ( '){' ) ;
    public final void rule__Conveyor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3189:1: ( ( '){' ) )
            // InternalStl.g:3190:1: ( '){' )
            {
            // InternalStl.g:3190:1: ( '){' )
            // InternalStl.g:3191:2: '){'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getRightParenthesisLeftCurlyBracketKeyword_4()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getRightParenthesisLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__4__Impl"


    // $ANTLR start "rule__Conveyor__Group__5"
    // InternalStl.g:3200:1: rule__Conveyor__Group__5 : rule__Conveyor__Group__5__Impl rule__Conveyor__Group__6 ;
    public final void rule__Conveyor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3204:1: ( rule__Conveyor__Group__5__Impl rule__Conveyor__Group__6 )
            // InternalStl.g:3205:2: rule__Conveyor__Group__5__Impl rule__Conveyor__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Conveyor__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__5"


    // $ANTLR start "rule__Conveyor__Group__5__Impl"
    // InternalStl.g:3212:1: rule__Conveyor__Group__5__Impl : ( 'input' ) ;
    public final void rule__Conveyor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3216:1: ( ( 'input' ) )
            // InternalStl.g:3217:1: ( 'input' )
            {
            // InternalStl.g:3217:1: ( 'input' )
            // InternalStl.g:3218:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getInputKeyword_5()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getInputKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__5__Impl"


    // $ANTLR start "rule__Conveyor__Group__6"
    // InternalStl.g:3227:1: rule__Conveyor__Group__6 : rule__Conveyor__Group__6__Impl rule__Conveyor__Group__7 ;
    public final void rule__Conveyor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3231:1: ( rule__Conveyor__Group__6__Impl rule__Conveyor__Group__7 )
            // InternalStl.g:3232:2: rule__Conveyor__Group__6__Impl rule__Conveyor__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Conveyor__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__6"


    // $ANTLR start "rule__Conveyor__Group__6__Impl"
    // InternalStl.g:3239:1: rule__Conveyor__Group__6__Impl : ( ( rule__Conveyor__InputSlotsAssignment_6 ) ) ;
    public final void rule__Conveyor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3243:1: ( ( ( rule__Conveyor__InputSlotsAssignment_6 ) ) )
            // InternalStl.g:3244:1: ( ( rule__Conveyor__InputSlotsAssignment_6 ) )
            {
            // InternalStl.g:3244:1: ( ( rule__Conveyor__InputSlotsAssignment_6 ) )
            // InternalStl.g:3245:2: ( rule__Conveyor__InputSlotsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getInputSlotsAssignment_6()); 
            }
            // InternalStl.g:3246:2: ( rule__Conveyor__InputSlotsAssignment_6 )
            // InternalStl.g:3246:3: rule__Conveyor__InputSlotsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__InputSlotsAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getInputSlotsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__6__Impl"


    // $ANTLR start "rule__Conveyor__Group__7"
    // InternalStl.g:3254:1: rule__Conveyor__Group__7 : rule__Conveyor__Group__7__Impl rule__Conveyor__Group__8 ;
    public final void rule__Conveyor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3258:1: ( rule__Conveyor__Group__7__Impl rule__Conveyor__Group__8 )
            // InternalStl.g:3259:2: rule__Conveyor__Group__7__Impl rule__Conveyor__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__Conveyor__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__7"


    // $ANTLR start "rule__Conveyor__Group__7__Impl"
    // InternalStl.g:3266:1: rule__Conveyor__Group__7__Impl : ( 'output' ) ;
    public final void rule__Conveyor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3270:1: ( ( 'output' ) )
            // InternalStl.g:3271:1: ( 'output' )
            {
            // InternalStl.g:3271:1: ( 'output' )
            // InternalStl.g:3272:2: 'output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getOutputKeyword_7()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getOutputKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__7__Impl"


    // $ANTLR start "rule__Conveyor__Group__8"
    // InternalStl.g:3281:1: rule__Conveyor__Group__8 : rule__Conveyor__Group__8__Impl rule__Conveyor__Group__9 ;
    public final void rule__Conveyor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3285:1: ( rule__Conveyor__Group__8__Impl rule__Conveyor__Group__9 )
            // InternalStl.g:3286:2: rule__Conveyor__Group__8__Impl rule__Conveyor__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Conveyor__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__8"


    // $ANTLR start "rule__Conveyor__Group__8__Impl"
    // InternalStl.g:3293:1: rule__Conveyor__Group__8__Impl : ( ( rule__Conveyor__OutputSlotsAssignment_8 ) ) ;
    public final void rule__Conveyor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3297:1: ( ( ( rule__Conveyor__OutputSlotsAssignment_8 ) ) )
            // InternalStl.g:3298:1: ( ( rule__Conveyor__OutputSlotsAssignment_8 ) )
            {
            // InternalStl.g:3298:1: ( ( rule__Conveyor__OutputSlotsAssignment_8 ) )
            // InternalStl.g:3299:2: ( rule__Conveyor__OutputSlotsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getOutputSlotsAssignment_8()); 
            }
            // InternalStl.g:3300:2: ( rule__Conveyor__OutputSlotsAssignment_8 )
            // InternalStl.g:3300:3: rule__Conveyor__OutputSlotsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__OutputSlotsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getOutputSlotsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__8__Impl"


    // $ANTLR start "rule__Conveyor__Group__9"
    // InternalStl.g:3308:1: rule__Conveyor__Group__9 : rule__Conveyor__Group__9__Impl rule__Conveyor__Group__10 ;
    public final void rule__Conveyor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3312:1: ( rule__Conveyor__Group__9__Impl rule__Conveyor__Group__10 )
            // InternalStl.g:3313:2: rule__Conveyor__Group__9__Impl rule__Conveyor__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__Conveyor__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__9"


    // $ANTLR start "rule__Conveyor__Group__9__Impl"
    // InternalStl.g:3320:1: rule__Conveyor__Group__9__Impl : ( ( rule__Conveyor__ServicesAssignment_9 )* ) ;
    public final void rule__Conveyor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3324:1: ( ( ( rule__Conveyor__ServicesAssignment_9 )* ) )
            // InternalStl.g:3325:1: ( ( rule__Conveyor__ServicesAssignment_9 )* )
            {
            // InternalStl.g:3325:1: ( ( rule__Conveyor__ServicesAssignment_9 )* )
            // InternalStl.g:3326:2: ( rule__Conveyor__ServicesAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getServicesAssignment_9()); 
            }
            // InternalStl.g:3327:2: ( rule__Conveyor__ServicesAssignment_9 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalStl.g:3327:3: rule__Conveyor__ServicesAssignment_9
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Conveyor__ServicesAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getServicesAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__9__Impl"


    // $ANTLR start "rule__Conveyor__Group__10"
    // InternalStl.g:3335:1: rule__Conveyor__Group__10 : rule__Conveyor__Group__10__Impl ;
    public final void rule__Conveyor__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3339:1: ( rule__Conveyor__Group__10__Impl )
            // InternalStl.g:3340:2: rule__Conveyor__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__10"


    // $ANTLR start "rule__Conveyor__Group__10__Impl"
    // InternalStl.g:3346:1: rule__Conveyor__Group__10__Impl : ( '}' ) ;
    public final void rule__Conveyor__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3350:1: ( ( '}' ) )
            // InternalStl.g:3351:1: ( '}' )
            {
            // InternalStl.g:3351:1: ( '}' )
            // InternalStl.g:3352:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__10__Impl"


    // $ANTLR start "rule__Machine__Group__0"
    // InternalStl.g:3362:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3366:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalStl.g:3367:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Machine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0"


    // $ANTLR start "rule__Machine__Group__0__Impl"
    // InternalStl.g:3374:1: rule__Machine__Group__0__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3378:1: ( ( 'machine' ) )
            // InternalStl.g:3379:1: ( 'machine' )
            {
            // InternalStl.g:3379:1: ( 'machine' )
            // InternalStl.g:3380:2: 'machine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getMachineKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0__Impl"


    // $ANTLR start "rule__Machine__Group__1"
    // InternalStl.g:3389:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3393:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalStl.g:3394:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Machine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1"


    // $ANTLR start "rule__Machine__Group__1__Impl"
    // InternalStl.g:3401:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__NameAssignment_1 ) ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3405:1: ( ( ( rule__Machine__NameAssignment_1 ) ) )
            // InternalStl.g:3406:1: ( ( rule__Machine__NameAssignment_1 ) )
            {
            // InternalStl.g:3406:1: ( ( rule__Machine__NameAssignment_1 ) )
            // InternalStl.g:3407:2: ( rule__Machine__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:3408:2: ( rule__Machine__NameAssignment_1 )
            // InternalStl.g:3408:3: rule__Machine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1__Impl"


    // $ANTLR start "rule__Machine__Group__2"
    // InternalStl.g:3416:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3420:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalStl.g:3421:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Machine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2"


    // $ANTLR start "rule__Machine__Group__2__Impl"
    // InternalStl.g:3428:1: rule__Machine__Group__2__Impl : ( '(cost=' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3432:1: ( ( '(cost=' ) )
            // InternalStl.g:3433:1: ( '(cost=' )
            {
            // InternalStl.g:3433:1: ( '(cost=' )
            // InternalStl.g:3434:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCostKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getCostKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2__Impl"


    // $ANTLR start "rule__Machine__Group__3"
    // InternalStl.g:3443:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3447:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalStl.g:3448:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Machine__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3"


    // $ANTLR start "rule__Machine__Group__3__Impl"
    // InternalStl.g:3455:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__CostAssignment_3 ) ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3459:1: ( ( ( rule__Machine__CostAssignment_3 ) ) )
            // InternalStl.g:3460:1: ( ( rule__Machine__CostAssignment_3 ) )
            {
            // InternalStl.g:3460:1: ( ( rule__Machine__CostAssignment_3 ) )
            // InternalStl.g:3461:2: ( rule__Machine__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:3462:2: ( rule__Machine__CostAssignment_3 )
            // InternalStl.g:3462:3: rule__Machine__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Machine__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getCostAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3__Impl"


    // $ANTLR start "rule__Machine__Group__4"
    // InternalStl.g:3470:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3474:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalStl.g:3475:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Machine__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4"


    // $ANTLR start "rule__Machine__Group__4__Impl"
    // InternalStl.g:3482:1: rule__Machine__Group__4__Impl : ( '){' ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3486:1: ( ( '){' ) )
            // InternalStl.g:3487:1: ( '){' )
            {
            // InternalStl.g:3487:1: ( '){' )
            // InternalStl.g:3488:2: '){'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRightParenthesisLeftCurlyBracketKeyword_4()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRightParenthesisLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4__Impl"


    // $ANTLR start "rule__Machine__Group__5"
    // InternalStl.g:3497:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3501:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalStl.g:3502:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Machine__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__5"


    // $ANTLR start "rule__Machine__Group__5__Impl"
    // InternalStl.g:3509:1: rule__Machine__Group__5__Impl : ( ( ( rule__Machine__Group_5__0 ) ) ( ( rule__Machine__Group_5__0 )* ) ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3513:1: ( ( ( ( rule__Machine__Group_5__0 ) ) ( ( rule__Machine__Group_5__0 )* ) ) )
            // InternalStl.g:3514:1: ( ( ( rule__Machine__Group_5__0 ) ) ( ( rule__Machine__Group_5__0 )* ) )
            {
            // InternalStl.g:3514:1: ( ( ( rule__Machine__Group_5__0 ) ) ( ( rule__Machine__Group_5__0 )* ) )
            // InternalStl.g:3515:2: ( ( rule__Machine__Group_5__0 ) ) ( ( rule__Machine__Group_5__0 )* )
            {
            // InternalStl.g:3515:2: ( ( rule__Machine__Group_5__0 ) )
            // InternalStl.g:3516:3: ( rule__Machine__Group_5__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_5()); 
            }
            // InternalStl.g:3517:3: ( rule__Machine__Group_5__0 )
            // InternalStl.g:3517:4: rule__Machine__Group_5__0
            {
            pushFollow(FOLLOW_23);
            rule__Machine__Group_5__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_5()); 
            }

            }

            // InternalStl.g:3520:2: ( ( rule__Machine__Group_5__0 )* )
            // InternalStl.g:3521:3: ( rule__Machine__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_5()); 
            }
            // InternalStl.g:3522:3: ( rule__Machine__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalStl.g:3522:4: rule__Machine__Group_5__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Machine__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_5()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__5__Impl"


    // $ANTLR start "rule__Machine__Group__6"
    // InternalStl.g:3531:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3535:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // InternalStl.g:3536:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Machine__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__6"


    // $ANTLR start "rule__Machine__Group__6__Impl"
    // InternalStl.g:3543:1: rule__Machine__Group__6__Impl : ( ( ( rule__Machine__Group_6__0 ) ) ( ( rule__Machine__Group_6__0 )* ) ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3547:1: ( ( ( ( rule__Machine__Group_6__0 ) ) ( ( rule__Machine__Group_6__0 )* ) ) )
            // InternalStl.g:3548:1: ( ( ( rule__Machine__Group_6__0 ) ) ( ( rule__Machine__Group_6__0 )* ) )
            {
            // InternalStl.g:3548:1: ( ( ( rule__Machine__Group_6__0 ) ) ( ( rule__Machine__Group_6__0 )* ) )
            // InternalStl.g:3549:2: ( ( rule__Machine__Group_6__0 ) ) ( ( rule__Machine__Group_6__0 )* )
            {
            // InternalStl.g:3549:2: ( ( rule__Machine__Group_6__0 ) )
            // InternalStl.g:3550:3: ( rule__Machine__Group_6__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_6()); 
            }
            // InternalStl.g:3551:3: ( rule__Machine__Group_6__0 )
            // InternalStl.g:3551:4: rule__Machine__Group_6__0
            {
            pushFollow(FOLLOW_30);
            rule__Machine__Group_6__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_6()); 
            }

            }

            // InternalStl.g:3554:2: ( ( rule__Machine__Group_6__0 )* )
            // InternalStl.g:3555:3: ( rule__Machine__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_6()); 
            }
            // InternalStl.g:3556:3: ( rule__Machine__Group_6__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalStl.g:3556:4: rule__Machine__Group_6__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Machine__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_6()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__6__Impl"


    // $ANTLR start "rule__Machine__Group__7"
    // InternalStl.g:3565:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3569:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // InternalStl.g:3570:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Machine__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__7"


    // $ANTLR start "rule__Machine__Group__7__Impl"
    // InternalStl.g:3577:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__ServicesAssignment_7 )* ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3581:1: ( ( ( rule__Machine__ServicesAssignment_7 )* ) )
            // InternalStl.g:3582:1: ( ( rule__Machine__ServicesAssignment_7 )* )
            {
            // InternalStl.g:3582:1: ( ( rule__Machine__ServicesAssignment_7 )* )
            // InternalStl.g:3583:2: ( rule__Machine__ServicesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getServicesAssignment_7()); 
            }
            // InternalStl.g:3584:2: ( rule__Machine__ServicesAssignment_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalStl.g:3584:3: rule__Machine__ServicesAssignment_7
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Machine__ServicesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getServicesAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__7__Impl"


    // $ANTLR start "rule__Machine__Group__8"
    // InternalStl.g:3592:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3596:1: ( rule__Machine__Group__8__Impl )
            // InternalStl.g:3597:2: rule__Machine__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__8"


    // $ANTLR start "rule__Machine__Group__8__Impl"
    // InternalStl.g:3603:1: rule__Machine__Group__8__Impl : ( '}' ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3607:1: ( ( '}' ) )
            // InternalStl.g:3608:1: ( '}' )
            {
            // InternalStl.g:3608:1: ( '}' )
            // InternalStl.g:3609:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__8__Impl"


    // $ANTLR start "rule__Machine__Group_5__0"
    // InternalStl.g:3619:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3623:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // InternalStl.g:3624:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Machine__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__0"


    // $ANTLR start "rule__Machine__Group_5__0__Impl"
    // InternalStl.g:3631:1: rule__Machine__Group_5__0__Impl : ( 'input' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3635:1: ( ( 'input' ) )
            // InternalStl.g:3636:1: ( 'input' )
            {
            // InternalStl.g:3636:1: ( 'input' )
            // InternalStl.g:3637:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInputKeyword_5_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInputKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__0__Impl"


    // $ANTLR start "rule__Machine__Group_5__1"
    // InternalStl.g:3646:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3650:1: ( rule__Machine__Group_5__1__Impl )
            // InternalStl.g:3651:2: rule__Machine__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__1"


    // $ANTLR start "rule__Machine__Group_5__1__Impl"
    // InternalStl.g:3657:1: rule__Machine__Group_5__1__Impl : ( ( rule__Machine__InputSlotsAssignment_5_1 ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3661:1: ( ( ( rule__Machine__InputSlotsAssignment_5_1 ) ) )
            // InternalStl.g:3662:1: ( ( rule__Machine__InputSlotsAssignment_5_1 ) )
            {
            // InternalStl.g:3662:1: ( ( rule__Machine__InputSlotsAssignment_5_1 ) )
            // InternalStl.g:3663:2: ( rule__Machine__InputSlotsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInputSlotsAssignment_5_1()); 
            }
            // InternalStl.g:3664:2: ( rule__Machine__InputSlotsAssignment_5_1 )
            // InternalStl.g:3664:3: rule__Machine__InputSlotsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__InputSlotsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInputSlotsAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__1__Impl"


    // $ANTLR start "rule__Machine__Group_6__0"
    // InternalStl.g:3673:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3677:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // InternalStl.g:3678:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Machine__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__0"


    // $ANTLR start "rule__Machine__Group_6__0__Impl"
    // InternalStl.g:3685:1: rule__Machine__Group_6__0__Impl : ( 'output' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3689:1: ( ( 'output' ) )
            // InternalStl.g:3690:1: ( 'output' )
            {
            // InternalStl.g:3690:1: ( 'output' )
            // InternalStl.g:3691:2: 'output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOutputKeyword_6_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOutputKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__0__Impl"


    // $ANTLR start "rule__Machine__Group_6__1"
    // InternalStl.g:3700:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3704:1: ( rule__Machine__Group_6__1__Impl )
            // InternalStl.g:3705:2: rule__Machine__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__1"


    // $ANTLR start "rule__Machine__Group_6__1__Impl"
    // InternalStl.g:3711:1: rule__Machine__Group_6__1__Impl : ( ( rule__Machine__OutputSlotsAssignment_6_1 ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3715:1: ( ( ( rule__Machine__OutputSlotsAssignment_6_1 ) ) )
            // InternalStl.g:3716:1: ( ( rule__Machine__OutputSlotsAssignment_6_1 ) )
            {
            // InternalStl.g:3716:1: ( ( rule__Machine__OutputSlotsAssignment_6_1 ) )
            // InternalStl.g:3717:2: ( rule__Machine__OutputSlotsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOutputSlotsAssignment_6_1()); 
            }
            // InternalStl.g:3718:2: ( rule__Machine__OutputSlotsAssignment_6_1 )
            // InternalStl.g:3718:3: rule__Machine__OutputSlotsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__OutputSlotsAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOutputSlotsAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__1__Impl"


    // $ANTLR start "rule__TurnTable__Group__0"
    // InternalStl.g:3727:1: rule__TurnTable__Group__0 : rule__TurnTable__Group__0__Impl rule__TurnTable__Group__1 ;
    public final void rule__TurnTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3731:1: ( rule__TurnTable__Group__0__Impl rule__TurnTable__Group__1 )
            // InternalStl.g:3732:2: rule__TurnTable__Group__0__Impl rule__TurnTable__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TurnTable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__0"


    // $ANTLR start "rule__TurnTable__Group__0__Impl"
    // InternalStl.g:3739:1: rule__TurnTable__Group__0__Impl : ( 'turntable' ) ;
    public final void rule__TurnTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3743:1: ( ( 'turntable' ) )
            // InternalStl.g:3744:1: ( 'turntable' )
            {
            // InternalStl.g:3744:1: ( 'turntable' )
            // InternalStl.g:3745:2: 'turntable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getTurntableKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getTurntableKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__0__Impl"


    // $ANTLR start "rule__TurnTable__Group__1"
    // InternalStl.g:3754:1: rule__TurnTable__Group__1 : rule__TurnTable__Group__1__Impl rule__TurnTable__Group__2 ;
    public final void rule__TurnTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3758:1: ( rule__TurnTable__Group__1__Impl rule__TurnTable__Group__2 )
            // InternalStl.g:3759:2: rule__TurnTable__Group__1__Impl rule__TurnTable__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TurnTable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__1"


    // $ANTLR start "rule__TurnTable__Group__1__Impl"
    // InternalStl.g:3766:1: rule__TurnTable__Group__1__Impl : ( ( rule__TurnTable__NameAssignment_1 ) ) ;
    public final void rule__TurnTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3770:1: ( ( ( rule__TurnTable__NameAssignment_1 ) ) )
            // InternalStl.g:3771:1: ( ( rule__TurnTable__NameAssignment_1 ) )
            {
            // InternalStl.g:3771:1: ( ( rule__TurnTable__NameAssignment_1 ) )
            // InternalStl.g:3772:2: ( rule__TurnTable__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:3773:2: ( rule__TurnTable__NameAssignment_1 )
            // InternalStl.g:3773:3: rule__TurnTable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__1__Impl"


    // $ANTLR start "rule__TurnTable__Group__2"
    // InternalStl.g:3781:1: rule__TurnTable__Group__2 : rule__TurnTable__Group__2__Impl rule__TurnTable__Group__3 ;
    public final void rule__TurnTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3785:1: ( rule__TurnTable__Group__2__Impl rule__TurnTable__Group__3 )
            // InternalStl.g:3786:2: rule__TurnTable__Group__2__Impl rule__TurnTable__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__TurnTable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__2"


    // $ANTLR start "rule__TurnTable__Group__2__Impl"
    // InternalStl.g:3793:1: rule__TurnTable__Group__2__Impl : ( '(cost=' ) ;
    public final void rule__TurnTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3797:1: ( ( '(cost=' ) )
            // InternalStl.g:3798:1: ( '(cost=' )
            {
            // InternalStl.g:3798:1: ( '(cost=' )
            // InternalStl.g:3799:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getCostKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getCostKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__2__Impl"


    // $ANTLR start "rule__TurnTable__Group__3"
    // InternalStl.g:3808:1: rule__TurnTable__Group__3 : rule__TurnTable__Group__3__Impl rule__TurnTable__Group__4 ;
    public final void rule__TurnTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3812:1: ( rule__TurnTable__Group__3__Impl rule__TurnTable__Group__4 )
            // InternalStl.g:3813:2: rule__TurnTable__Group__3__Impl rule__TurnTable__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__TurnTable__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__3"


    // $ANTLR start "rule__TurnTable__Group__3__Impl"
    // InternalStl.g:3820:1: rule__TurnTable__Group__3__Impl : ( ( rule__TurnTable__CostAssignment_3 ) ) ;
    public final void rule__TurnTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3824:1: ( ( ( rule__TurnTable__CostAssignment_3 ) ) )
            // InternalStl.g:3825:1: ( ( rule__TurnTable__CostAssignment_3 ) )
            {
            // InternalStl.g:3825:1: ( ( rule__TurnTable__CostAssignment_3 ) )
            // InternalStl.g:3826:2: ( rule__TurnTable__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:3827:2: ( rule__TurnTable__CostAssignment_3 )
            // InternalStl.g:3827:3: rule__TurnTable__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getCostAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__3__Impl"


    // $ANTLR start "rule__TurnTable__Group__4"
    // InternalStl.g:3835:1: rule__TurnTable__Group__4 : rule__TurnTable__Group__4__Impl rule__TurnTable__Group__5 ;
    public final void rule__TurnTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3839:1: ( rule__TurnTable__Group__4__Impl rule__TurnTable__Group__5 )
            // InternalStl.g:3840:2: rule__TurnTable__Group__4__Impl rule__TurnTable__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__TurnTable__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__4"


    // $ANTLR start "rule__TurnTable__Group__4__Impl"
    // InternalStl.g:3847:1: rule__TurnTable__Group__4__Impl : ( '){' ) ;
    public final void rule__TurnTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3851:1: ( ( '){' ) )
            // InternalStl.g:3852:1: ( '){' )
            {
            // InternalStl.g:3852:1: ( '){' )
            // InternalStl.g:3853:2: '){'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getRightParenthesisLeftCurlyBracketKeyword_4()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getRightParenthesisLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__4__Impl"


    // $ANTLR start "rule__TurnTable__Group__5"
    // InternalStl.g:3862:1: rule__TurnTable__Group__5 : rule__TurnTable__Group__5__Impl rule__TurnTable__Group__6 ;
    public final void rule__TurnTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3866:1: ( rule__TurnTable__Group__5__Impl rule__TurnTable__Group__6 )
            // InternalStl.g:3867:2: rule__TurnTable__Group__5__Impl rule__TurnTable__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__TurnTable__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__5"


    // $ANTLR start "rule__TurnTable__Group__5__Impl"
    // InternalStl.g:3874:1: rule__TurnTable__Group__5__Impl : ( ( ( rule__TurnTable__Group_5__0 ) ) ( ( rule__TurnTable__Group_5__0 )* ) ) ;
    public final void rule__TurnTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3878:1: ( ( ( ( rule__TurnTable__Group_5__0 ) ) ( ( rule__TurnTable__Group_5__0 )* ) ) )
            // InternalStl.g:3879:1: ( ( ( rule__TurnTable__Group_5__0 ) ) ( ( rule__TurnTable__Group_5__0 )* ) )
            {
            // InternalStl.g:3879:1: ( ( ( rule__TurnTable__Group_5__0 ) ) ( ( rule__TurnTable__Group_5__0 )* ) )
            // InternalStl.g:3880:2: ( ( rule__TurnTable__Group_5__0 ) ) ( ( rule__TurnTable__Group_5__0 )* )
            {
            // InternalStl.g:3880:2: ( ( rule__TurnTable__Group_5__0 ) )
            // InternalStl.g:3881:3: ( rule__TurnTable__Group_5__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getGroup_5()); 
            }
            // InternalStl.g:3882:3: ( rule__TurnTable__Group_5__0 )
            // InternalStl.g:3882:4: rule__TurnTable__Group_5__0
            {
            pushFollow(FOLLOW_23);
            rule__TurnTable__Group_5__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getGroup_5()); 
            }

            }

            // InternalStl.g:3885:2: ( ( rule__TurnTable__Group_5__0 )* )
            // InternalStl.g:3886:3: ( rule__TurnTable__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getGroup_5()); 
            }
            // InternalStl.g:3887:3: ( rule__TurnTable__Group_5__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalStl.g:3887:4: rule__TurnTable__Group_5__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__TurnTable__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getGroup_5()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__5__Impl"


    // $ANTLR start "rule__TurnTable__Group__6"
    // InternalStl.g:3896:1: rule__TurnTable__Group__6 : rule__TurnTable__Group__6__Impl rule__TurnTable__Group__7 ;
    public final void rule__TurnTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3900:1: ( rule__TurnTable__Group__6__Impl rule__TurnTable__Group__7 )
            // InternalStl.g:3901:2: rule__TurnTable__Group__6__Impl rule__TurnTable__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__TurnTable__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__6"


    // $ANTLR start "rule__TurnTable__Group__6__Impl"
    // InternalStl.g:3908:1: rule__TurnTable__Group__6__Impl : ( ( ( rule__TurnTable__Group_6__0 ) ) ( ( rule__TurnTable__Group_6__0 )* ) ) ;
    public final void rule__TurnTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3912:1: ( ( ( ( rule__TurnTable__Group_6__0 ) ) ( ( rule__TurnTable__Group_6__0 )* ) ) )
            // InternalStl.g:3913:1: ( ( ( rule__TurnTable__Group_6__0 ) ) ( ( rule__TurnTable__Group_6__0 )* ) )
            {
            // InternalStl.g:3913:1: ( ( ( rule__TurnTable__Group_6__0 ) ) ( ( rule__TurnTable__Group_6__0 )* ) )
            // InternalStl.g:3914:2: ( ( rule__TurnTable__Group_6__0 ) ) ( ( rule__TurnTable__Group_6__0 )* )
            {
            // InternalStl.g:3914:2: ( ( rule__TurnTable__Group_6__0 ) )
            // InternalStl.g:3915:3: ( rule__TurnTable__Group_6__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getGroup_6()); 
            }
            // InternalStl.g:3916:3: ( rule__TurnTable__Group_6__0 )
            // InternalStl.g:3916:4: rule__TurnTable__Group_6__0
            {
            pushFollow(FOLLOW_30);
            rule__TurnTable__Group_6__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getGroup_6()); 
            }

            }

            // InternalStl.g:3919:2: ( ( rule__TurnTable__Group_6__0 )* )
            // InternalStl.g:3920:3: ( rule__TurnTable__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getGroup_6()); 
            }
            // InternalStl.g:3921:3: ( rule__TurnTable__Group_6__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalStl.g:3921:4: rule__TurnTable__Group_6__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__TurnTable__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getGroup_6()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__6__Impl"


    // $ANTLR start "rule__TurnTable__Group__7"
    // InternalStl.g:3930:1: rule__TurnTable__Group__7 : rule__TurnTable__Group__7__Impl rule__TurnTable__Group__8 ;
    public final void rule__TurnTable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3934:1: ( rule__TurnTable__Group__7__Impl rule__TurnTable__Group__8 )
            // InternalStl.g:3935:2: rule__TurnTable__Group__7__Impl rule__TurnTable__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__TurnTable__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__7"


    // $ANTLR start "rule__TurnTable__Group__7__Impl"
    // InternalStl.g:3942:1: rule__TurnTable__Group__7__Impl : ( ( rule__TurnTable__ServicesAssignment_7 )* ) ;
    public final void rule__TurnTable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3946:1: ( ( ( rule__TurnTable__ServicesAssignment_7 )* ) )
            // InternalStl.g:3947:1: ( ( rule__TurnTable__ServicesAssignment_7 )* )
            {
            // InternalStl.g:3947:1: ( ( rule__TurnTable__ServicesAssignment_7 )* )
            // InternalStl.g:3948:2: ( rule__TurnTable__ServicesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getServicesAssignment_7()); 
            }
            // InternalStl.g:3949:2: ( rule__TurnTable__ServicesAssignment_7 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==20) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalStl.g:3949:3: rule__TurnTable__ServicesAssignment_7
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__TurnTable__ServicesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getServicesAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__7__Impl"


    // $ANTLR start "rule__TurnTable__Group__8"
    // InternalStl.g:3957:1: rule__TurnTable__Group__8 : rule__TurnTable__Group__8__Impl ;
    public final void rule__TurnTable__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3961:1: ( rule__TurnTable__Group__8__Impl )
            // InternalStl.g:3962:2: rule__TurnTable__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__8"


    // $ANTLR start "rule__TurnTable__Group__8__Impl"
    // InternalStl.g:3968:1: rule__TurnTable__Group__8__Impl : ( '}' ) ;
    public final void rule__TurnTable__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3972:1: ( ( '}' ) )
            // InternalStl.g:3973:1: ( '}' )
            {
            // InternalStl.g:3973:1: ( '}' )
            // InternalStl.g:3974:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__8__Impl"


    // $ANTLR start "rule__TurnTable__Group_5__0"
    // InternalStl.g:3984:1: rule__TurnTable__Group_5__0 : rule__TurnTable__Group_5__0__Impl rule__TurnTable__Group_5__1 ;
    public final void rule__TurnTable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3988:1: ( rule__TurnTable__Group_5__0__Impl rule__TurnTable__Group_5__1 )
            // InternalStl.g:3989:2: rule__TurnTable__Group_5__0__Impl rule__TurnTable__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__TurnTable__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group_5__0"


    // $ANTLR start "rule__TurnTable__Group_5__0__Impl"
    // InternalStl.g:3996:1: rule__TurnTable__Group_5__0__Impl : ( 'input' ) ;
    public final void rule__TurnTable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4000:1: ( ( 'input' ) )
            // InternalStl.g:4001:1: ( 'input' )
            {
            // InternalStl.g:4001:1: ( 'input' )
            // InternalStl.g:4002:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getInputKeyword_5_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getInputKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group_5__0__Impl"


    // $ANTLR start "rule__TurnTable__Group_5__1"
    // InternalStl.g:4011:1: rule__TurnTable__Group_5__1 : rule__TurnTable__Group_5__1__Impl ;
    public final void rule__TurnTable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4015:1: ( rule__TurnTable__Group_5__1__Impl )
            // InternalStl.g:4016:2: rule__TurnTable__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group_5__1"


    // $ANTLR start "rule__TurnTable__Group_5__1__Impl"
    // InternalStl.g:4022:1: rule__TurnTable__Group_5__1__Impl : ( ( rule__TurnTable__InputSlotsAssignment_5_1 ) ) ;
    public final void rule__TurnTable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4026:1: ( ( ( rule__TurnTable__InputSlotsAssignment_5_1 ) ) )
            // InternalStl.g:4027:1: ( ( rule__TurnTable__InputSlotsAssignment_5_1 ) )
            {
            // InternalStl.g:4027:1: ( ( rule__TurnTable__InputSlotsAssignment_5_1 ) )
            // InternalStl.g:4028:2: ( rule__TurnTable__InputSlotsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getInputSlotsAssignment_5_1()); 
            }
            // InternalStl.g:4029:2: ( rule__TurnTable__InputSlotsAssignment_5_1 )
            // InternalStl.g:4029:3: rule__TurnTable__InputSlotsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__InputSlotsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getInputSlotsAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group_5__1__Impl"


    // $ANTLR start "rule__TurnTable__Group_6__0"
    // InternalStl.g:4038:1: rule__TurnTable__Group_6__0 : rule__TurnTable__Group_6__0__Impl rule__TurnTable__Group_6__1 ;
    public final void rule__TurnTable__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4042:1: ( rule__TurnTable__Group_6__0__Impl rule__TurnTable__Group_6__1 )
            // InternalStl.g:4043:2: rule__TurnTable__Group_6__0__Impl rule__TurnTable__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__TurnTable__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group_6__0"


    // $ANTLR start "rule__TurnTable__Group_6__0__Impl"
    // InternalStl.g:4050:1: rule__TurnTable__Group_6__0__Impl : ( 'output' ) ;
    public final void rule__TurnTable__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4054:1: ( ( 'output' ) )
            // InternalStl.g:4055:1: ( 'output' )
            {
            // InternalStl.g:4055:1: ( 'output' )
            // InternalStl.g:4056:2: 'output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getOutputKeyword_6_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getOutputKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group_6__0__Impl"


    // $ANTLR start "rule__TurnTable__Group_6__1"
    // InternalStl.g:4065:1: rule__TurnTable__Group_6__1 : rule__TurnTable__Group_6__1__Impl ;
    public final void rule__TurnTable__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4069:1: ( rule__TurnTable__Group_6__1__Impl )
            // InternalStl.g:4070:2: rule__TurnTable__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group_6__1"


    // $ANTLR start "rule__TurnTable__Group_6__1__Impl"
    // InternalStl.g:4076:1: rule__TurnTable__Group_6__1__Impl : ( ( rule__TurnTable__OutputSlotsAssignment_6_1 ) ) ;
    public final void rule__TurnTable__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4080:1: ( ( ( rule__TurnTable__OutputSlotsAssignment_6_1 ) ) )
            // InternalStl.g:4081:1: ( ( rule__TurnTable__OutputSlotsAssignment_6_1 ) )
            {
            // InternalStl.g:4081:1: ( ( rule__TurnTable__OutputSlotsAssignment_6_1 ) )
            // InternalStl.g:4082:2: ( rule__TurnTable__OutputSlotsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getOutputSlotsAssignment_6_1()); 
            }
            // InternalStl.g:4083:2: ( rule__TurnTable__OutputSlotsAssignment_6_1 )
            // InternalStl.g:4083:3: rule__TurnTable__OutputSlotsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__OutputSlotsAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getOutputSlotsAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group_6__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalStl.g:4092:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4096:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalStl.g:4097:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalStl.g:4104:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4108:1: ( ( RULE_ID ) )
            // InternalStl.g:4109:1: ( RULE_ID )
            {
            // InternalStl.g:4109:1: ( RULE_ID )
            // InternalStl.g:4110:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalStl.g:4119:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4123:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalStl.g:4124:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalStl.g:4130:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4134:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalStl.g:4135:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalStl.g:4135:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalStl.g:4136:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalStl.g:4137:2: ( rule__QualifiedName__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalStl.g:4137:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalStl.g:4146:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4150:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalStl.g:4151:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalStl.g:4158:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4162:1: ( ( ( '.' ) ) )
            // InternalStl.g:4163:1: ( ( '.' ) )
            {
            // InternalStl.g:4163:1: ( ( '.' ) )
            // InternalStl.g:4164:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalStl.g:4165:2: ( '.' )
            // InternalStl.g:4165:3: '.'
            {
            match(input,38,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalStl.g:4173:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4177:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalStl.g:4178:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalStl.g:4184:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4188:1: ( ( RULE_ID ) )
            // InternalStl.g:4189:1: ( RULE_ID )
            {
            // InternalStl.g:4189:1: ( RULE_ID )
            // InternalStl.g:4190:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalStl.g:4200:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4204:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalStl.g:4205:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalStl.g:4212:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4216:1: ( ( ( '-' )? ) )
            // InternalStl.g:4217:1: ( ( '-' )? )
            {
            // InternalStl.g:4217:1: ( ( '-' )? )
            // InternalStl.g:4218:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalStl.g:4219:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalStl.g:4219:3: '-'
                    {
                    match(input,39,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalStl.g:4227:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4231:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalStl.g:4232:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalStl.g:4239:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4243:1: ( ( ( RULE_INT )? ) )
            // InternalStl.g:4244:1: ( ( RULE_INT )? )
            {
            // InternalStl.g:4244:1: ( ( RULE_INT )? )
            // InternalStl.g:4245:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            }
            // InternalStl.g:4246:2: ( RULE_INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalStl.g:4246:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalStl.g:4254:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4258:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalStl.g:4259:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__EDouble__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalStl.g:4266:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4270:1: ( ( '.' ) )
            // InternalStl.g:4271:1: ( '.' )
            {
            // InternalStl.g:4271:1: ( '.' )
            // InternalStl.g:4272:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalStl.g:4281:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4285:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalStl.g:4286:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__EDouble__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalStl.g:4293:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4297:1: ( ( RULE_INT ) )
            // InternalStl.g:4298:1: ( RULE_INT )
            {
            // InternalStl.g:4298:1: ( RULE_INT )
            // InternalStl.g:4299:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalStl.g:4308:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4312:1: ( rule__EDouble__Group__4__Impl )
            // InternalStl.g:4313:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalStl.g:4319:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4323:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalStl.g:4324:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalStl.g:4324:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalStl.g:4325:2: ( rule__EDouble__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            }
            // InternalStl.g:4326:2: ( rule__EDouble__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=11 && LA25_0<=12)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalStl.g:4326:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalStl.g:4335:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4339:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalStl.g:4340:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalStl.g:4347:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4351:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalStl.g:4352:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalStl.g:4352:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalStl.g:4353:2: ( rule__EDouble__Alternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            }
            // InternalStl.g:4354:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalStl.g:4354:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalStl.g:4362:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4366:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalStl.g:4367:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalStl.g:4374:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4378:1: ( ( ( '-' )? ) )
            // InternalStl.g:4379:1: ( ( '-' )? )
            {
            // InternalStl.g:4379:1: ( ( '-' )? )
            // InternalStl.g:4380:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            }
            // InternalStl.g:4381:2: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalStl.g:4381:3: '-'
                    {
                    match(input,39,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalStl.g:4389:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4393:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalStl.g:4394:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalStl.g:4400:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4404:1: ( ( RULE_INT ) )
            // InternalStl.g:4405:1: ( RULE_INT )
            {
            // InternalStl.g:4405:1: ( RULE_INT )
            // InternalStl.g:4406:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalStl.g:4416:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4420:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalStl.g:4421:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalStl.g:4428:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4432:1: ( ( ( '-' )? ) )
            // InternalStl.g:4433:1: ( ( '-' )? )
            {
            // InternalStl.g:4433:1: ( ( '-' )? )
            // InternalStl.g:4434:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalStl.g:4435:2: ( '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalStl.g:4435:3: '-'
                    {
                    match(input,39,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalStl.g:4443:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4447:1: ( rule__EInt__Group__1__Impl )
            // InternalStl.g:4448:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalStl.g:4454:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4458:1: ( ( RULE_INT ) )
            // InternalStl.g:4459:1: ( RULE_INT )
            {
            // InternalStl.g:4459:1: ( RULE_INT )
            // InternalStl.g:4460:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__System__NameAssignment_1"
    // InternalStl.g:4470:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4474:1: ( ( RULE_ID ) )
            // InternalStl.g:4475:2: ( RULE_ID )
            {
            // InternalStl.g:4475:2: ( RULE_ID )
            // InternalStl.g:4476:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__ItemTypesAssignment_3"
    // InternalStl.g:4485:1: rule__System__ItemTypesAssignment_3 : ( ruleItemType ) ;
    public final void rule__System__ItemTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4489:1: ( ( ruleItemType ) )
            // InternalStl.g:4490:2: ( ruleItemType )
            {
            // InternalStl.g:4490:2: ( ruleItemType )
            // InternalStl.g:4491:3: ruleItemType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getItemTypesItemTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleItemType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getItemTypesItemTypeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ItemTypesAssignment_3"


    // $ANTLR start "rule__System__AreasAssignment_4"
    // InternalStl.g:4500:1: rule__System__AreasAssignment_4 : ( ruleArea ) ;
    public final void rule__System__AreasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4504:1: ( ( ruleArea ) )
            // InternalStl.g:4505:2: ( ruleArea )
            {
            // InternalStl.g:4505:2: ( ruleArea )
            // InternalStl.g:4506:3: ruleArea
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getAreasAreaParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArea();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getAreasAreaParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__AreasAssignment_4"


    // $ANTLR start "rule__Area__NameAssignment_1"
    // InternalStl.g:4515:1: rule__Area__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Area__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4519:1: ( ( RULE_ID ) )
            // InternalStl.g:4520:2: ( RULE_ID )
            {
            // InternalStl.g:4520:2: ( RULE_ID )
            // InternalStl.g:4521:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__NameAssignment_1"


    // $ANTLR start "rule__Area__ComponentsAssignment_3"
    // InternalStl.g:4530:1: rule__Area__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__Area__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4534:1: ( ( ruleComponent ) )
            // InternalStl.g:4535:2: ( ruleComponent )
            {
            // InternalStl.g:4535:2: ( ruleComponent )
            // InternalStl.g:4536:3: ruleComponent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getComponentsComponentParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getComponentsComponentParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__ComponentsAssignment_3"


    // $ANTLR start "rule__Area__ConnectorsAssignment_4"
    // InternalStl.g:4545:1: rule__Area__ConnectorsAssignment_4 : ( ruleConnector ) ;
    public final void rule__Area__ConnectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4549:1: ( ( ruleConnector ) )
            // InternalStl.g:4550:2: ( ruleConnector )
            {
            // InternalStl.g:4550:2: ( ruleConnector )
            // InternalStl.g:4551:3: ruleConnector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getConnectorsConnectorParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getConnectorsConnectorParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__ConnectorsAssignment_4"


    // $ANTLR start "rule__ItemType__NameAssignment_1"
    // InternalStl.g:4560:1: rule__ItemType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ItemType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4564:1: ( ( RULE_ID ) )
            // InternalStl.g:4565:2: ( RULE_ID )
            {
            // InternalStl.g:4565:2: ( RULE_ID )
            // InternalStl.g:4566:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__NameAssignment_1"


    // $ANTLR start "rule__ItemType__DescriptionAssignment_3"
    // InternalStl.g:4575:1: rule__ItemType__DescriptionAssignment_3 : ( ruleEString ) ;
    public final void rule__ItemType__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4579:1: ( ( ruleEString ) )
            // InternalStl.g:4580:2: ( ruleEString )
            {
            // InternalStl.g:4580:2: ( ruleEString )
            // InternalStl.g:4581:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getDescriptionEStringParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getDescriptionEStringParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__DescriptionAssignment_3"


    // $ANTLR start "rule__Connector__EntryAssignment_0"
    // InternalStl.g:4590:1: rule__Connector__EntryAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connector__EntryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4594:1: ( ( ( ruleQualifiedName ) ) )
            // InternalStl.g:4595:2: ( ( ruleQualifiedName ) )
            {
            // InternalStl.g:4595:2: ( ( ruleQualifiedName ) )
            // InternalStl.g:4596:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getEntrySlotCrossReference_0_0()); 
            }
            // InternalStl.g:4597:3: ( ruleQualifiedName )
            // InternalStl.g:4598:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getEntrySlotQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getEntrySlotQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getEntrySlotCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__EntryAssignment_0"


    // $ANTLR start "rule__Connector__ExitAssignment_2"
    // InternalStl.g:4609:1: rule__Connector__ExitAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connector__ExitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4613:1: ( ( ( ruleQualifiedName ) ) )
            // InternalStl.g:4614:2: ( ( ruleQualifiedName ) )
            {
            // InternalStl.g:4614:2: ( ( ruleQualifiedName ) )
            // InternalStl.g:4615:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getExitSlotCrossReference_2_0()); 
            }
            // InternalStl.g:4616:3: ( ruleQualifiedName )
            // InternalStl.g:4617:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getExitSlotQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getExitSlotQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getExitSlotCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__ExitAssignment_2"


    // $ANTLR start "rule__Service__NameAssignment_0_1"
    // InternalStl.g:4628:1: rule__Service__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4632:1: ( ( RULE_ID ) )
            // InternalStl.g:4633:2: ( RULE_ID )
            {
            // InternalStl.g:4633:2: ( RULE_ID )
            // InternalStl.g:4634:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_0_1"


    // $ANTLR start "rule__Service__CostAssignment_0_3"
    // InternalStl.g:4643:1: rule__Service__CostAssignment_0_3 : ( ruleEInt ) ;
    public final void rule__Service__CostAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4647:1: ( ( ruleEInt ) )
            // InternalStl.g:4648:2: ( ruleEInt )
            {
            // InternalStl.g:4648:2: ( ruleEInt )
            // InternalStl.g:4649:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCostEIntParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCostEIntParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__CostAssignment_0_3"


    // $ANTLR start "rule__Service__ReliabilityAssignment_0_5"
    // InternalStl.g:4658:1: rule__Service__ReliabilityAssignment_0_5 : ( ruleEDouble ) ;
    public final void rule__Service__ReliabilityAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4662:1: ( ( ruleEDouble ) )
            // InternalStl.g:4663:2: ( ruleEDouble )
            {
            // InternalStl.g:4663:2: ( ruleEDouble )
            // InternalStl.g:4664:3: ruleEDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getReliabilityEDoubleParserRuleCall_0_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getReliabilityEDoubleParserRuleCall_0_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ReliabilityAssignment_0_5"


    // $ANTLR start "rule__Service__ProcessingTimeAssignment_0_7"
    // InternalStl.g:4673:1: rule__Service__ProcessingTimeAssignment_0_7 : ( ruleEInt ) ;
    public final void rule__Service__ProcessingTimeAssignment_0_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4677:1: ( ( ruleEInt ) )
            // InternalStl.g:4678:2: ( ruleEInt )
            {
            // InternalStl.g:4678:2: ( ruleEInt )
            // InternalStl.g:4679:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getProcessingTimeEIntParserRuleCall_0_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getProcessingTimeEIntParserRuleCall_0_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ProcessingTimeAssignment_0_7"


    // $ANTLR start "rule__Service__NameAssignment_1_1"
    // InternalStl.g:4688:1: rule__Service__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4692:1: ( ( RULE_ID ) )
            // InternalStl.g:4693:2: ( RULE_ID )
            {
            // InternalStl.g:4693:2: ( RULE_ID )
            // InternalStl.g:4694:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_1_1"


    // $ANTLR start "rule__Service__CostAssignment_1_3"
    // InternalStl.g:4703:1: rule__Service__CostAssignment_1_3 : ( ruleEInt ) ;
    public final void rule__Service__CostAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4707:1: ( ( ruleEInt ) )
            // InternalStl.g:4708:2: ( ruleEInt )
            {
            // InternalStl.g:4708:2: ( ruleEInt )
            // InternalStl.g:4709:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCostEIntParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCostEIntParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__CostAssignment_1_3"


    // $ANTLR start "rule__Service__ReliabilityAssignment_1_5"
    // InternalStl.g:4718:1: rule__Service__ReliabilityAssignment_1_5 : ( ruleEDouble ) ;
    public final void rule__Service__ReliabilityAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4722:1: ( ( ruleEDouble ) )
            // InternalStl.g:4723:2: ( ruleEDouble )
            {
            // InternalStl.g:4723:2: ( ruleEDouble )
            // InternalStl.g:4724:3: ruleEDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getReliabilityEDoubleParserRuleCall_1_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getReliabilityEDoubleParserRuleCall_1_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ReliabilityAssignment_1_5"


    // $ANTLR start "rule__Service__ProcessingTimeAssignment_1_7"
    // InternalStl.g:4733:1: rule__Service__ProcessingTimeAssignment_1_7 : ( ruleEInt ) ;
    public final void rule__Service__ProcessingTimeAssignment_1_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4737:1: ( ( ruleEInt ) )
            // InternalStl.g:4738:2: ( ruleEInt )
            {
            // InternalStl.g:4738:2: ( ruleEInt )
            // InternalStl.g:4739:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getProcessingTimeEIntParserRuleCall_1_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getProcessingTimeEIntParserRuleCall_1_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ProcessingTimeAssignment_1_7"


    // $ANTLR start "rule__Service__ParametersAssignment_1_9"
    // InternalStl.g:4748:1: rule__Service__ParametersAssignment_1_9 : ( ruleParameter ) ;
    public final void rule__Service__ParametersAssignment_1_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4752:1: ( ( ruleParameter ) )
            // InternalStl.g:4753:2: ( ruleParameter )
            {
            // InternalStl.g:4753:2: ( ruleParameter )
            // InternalStl.g:4754:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getParametersParameterParserRuleCall_1_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getParametersParameterParserRuleCall_1_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ParametersAssignment_1_9"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalStl.g:4763:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4767:1: ( ( RULE_ID ) )
            // InternalStl.g:4768:2: ( RULE_ID )
            {
            // InternalStl.g:4768:2: ( RULE_ID )
            // InternalStl.g:4769:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Slot__NameAssignment_0"
    // InternalStl.g:4778:1: rule__Slot__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Slot__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4782:1: ( ( RULE_ID ) )
            // InternalStl.g:4783:2: ( RULE_ID )
            {
            // InternalStl.g:4783:2: ( RULE_ID )
            // InternalStl.g:4784:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__NameAssignment_0"


    // $ANTLR start "rule__Slot__RequiredTypeAssignment_2"
    // InternalStl.g:4793:1: rule__Slot__RequiredTypeAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Slot__RequiredTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4797:1: ( ( ( ruleQualifiedName ) ) )
            // InternalStl.g:4798:2: ( ( ruleQualifiedName ) )
            {
            // InternalStl.g:4798:2: ( ( ruleQualifiedName ) )
            // InternalStl.g:4799:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getRequiredTypeItemTypeCrossReference_2_0()); 
            }
            // InternalStl.g:4800:3: ( ruleQualifiedName )
            // InternalStl.g:4801:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getRequiredTypeItemTypeQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getRequiredTypeItemTypeQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getRequiredTypeItemTypeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__RequiredTypeAssignment_2"


    // $ANTLR start "rule__ItemGenerator__NameAssignment_1"
    // InternalStl.g:4812:1: rule__ItemGenerator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ItemGenerator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4816:1: ( ( RULE_ID ) )
            // InternalStl.g:4817:2: ( RULE_ID )
            {
            // InternalStl.g:4817:2: ( RULE_ID )
            // InternalStl.g:4818:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__NameAssignment_1"


    // $ANTLR start "rule__ItemGenerator__GeneratedTypeAssignment_3"
    // InternalStl.g:4827:1: rule__ItemGenerator__GeneratedTypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ItemGenerator__GeneratedTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4831:1: ( ( ( ruleQualifiedName ) ) )
            // InternalStl.g:4832:2: ( ( ruleQualifiedName ) )
            {
            // InternalStl.g:4832:2: ( ( ruleQualifiedName ) )
            // InternalStl.g:4833:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeCrossReference_3_0()); 
            }
            // InternalStl.g:4834:3: ( ruleQualifiedName )
            // InternalStl.g:4835:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__GeneratedTypeAssignment_3"


    // $ANTLR start "rule__ItemGenerator__CostAssignment_5"
    // InternalStl.g:4846:1: rule__ItemGenerator__CostAssignment_5 : ( ruleEInt ) ;
    public final void rule__ItemGenerator__CostAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4850:1: ( ( ruleEInt ) )
            // InternalStl.g:4851:2: ( ruleEInt )
            {
            // InternalStl.g:4851:2: ( ruleEInt )
            // InternalStl.g:4852:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getCostEIntParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getCostEIntParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__CostAssignment_5"


    // $ANTLR start "rule__ItemGenerator__OutputSlotsAssignment_8"
    // InternalStl.g:4861:1: rule__ItemGenerator__OutputSlotsAssignment_8 : ( ruleSlot ) ;
    public final void rule__ItemGenerator__OutputSlotsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4865:1: ( ( ruleSlot ) )
            // InternalStl.g:4866:2: ( ruleSlot )
            {
            // InternalStl.g:4866:2: ( ruleSlot )
            // InternalStl.g:4867:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getOutputSlotsSlotParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getOutputSlotsSlotParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__OutputSlotsAssignment_8"


    // $ANTLR start "rule__ItemGenerator__ServicesAssignment_9"
    // InternalStl.g:4876:1: rule__ItemGenerator__ServicesAssignment_9 : ( ruleService ) ;
    public final void rule__ItemGenerator__ServicesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4880:1: ( ( ruleService ) )
            // InternalStl.g:4881:2: ( ruleService )
            {
            // InternalStl.g:4881:2: ( ruleService )
            // InternalStl.g:4882:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getServicesServiceParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getServicesServiceParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__ServicesAssignment_9"


    // $ANTLR start "rule__ProductStore__NameAssignment_1"
    // InternalStl.g:4891:1: rule__ProductStore__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProductStore__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4895:1: ( ( RULE_ID ) )
            // InternalStl.g:4896:2: ( RULE_ID )
            {
            // InternalStl.g:4896:2: ( RULE_ID )
            // InternalStl.g:4897:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__NameAssignment_1"


    // $ANTLR start "rule__ProductStore__CostAssignment_3"
    // InternalStl.g:4906:1: rule__ProductStore__CostAssignment_3 : ( ruleEInt ) ;
    public final void rule__ProductStore__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4910:1: ( ( ruleEInt ) )
            // InternalStl.g:4911:2: ( ruleEInt )
            {
            // InternalStl.g:4911:2: ( ruleEInt )
            // InternalStl.g:4912:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getCostEIntParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getCostEIntParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__CostAssignment_3"


    // $ANTLR start "rule__ProductStore__CapacityAssignment_5"
    // InternalStl.g:4921:1: rule__ProductStore__CapacityAssignment_5 : ( ruleEInt ) ;
    public final void rule__ProductStore__CapacityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4925:1: ( ( ruleEInt ) )
            // InternalStl.g:4926:2: ( ruleEInt )
            {
            // InternalStl.g:4926:2: ( ruleEInt )
            // InternalStl.g:4927:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getCapacityEIntParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getCapacityEIntParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__CapacityAssignment_5"


    // $ANTLR start "rule__ProductStore__InputSlotsAssignment_8"
    // InternalStl.g:4936:1: rule__ProductStore__InputSlotsAssignment_8 : ( ruleSlot ) ;
    public final void rule__ProductStore__InputSlotsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4940:1: ( ( ruleSlot ) )
            // InternalStl.g:4941:2: ( ruleSlot )
            {
            // InternalStl.g:4941:2: ( ruleSlot )
            // InternalStl.g:4942:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getInputSlotsSlotParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getInputSlotsSlotParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__InputSlotsAssignment_8"


    // $ANTLR start "rule__ProductStore__ServicesAssignment_9"
    // InternalStl.g:4951:1: rule__ProductStore__ServicesAssignment_9 : ( ruleService ) ;
    public final void rule__ProductStore__ServicesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4955:1: ( ( ruleService ) )
            // InternalStl.g:4956:2: ( ruleService )
            {
            // InternalStl.g:4956:2: ( ruleService )
            // InternalStl.g:4957:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getServicesServiceParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getServicesServiceParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__ServicesAssignment_9"


    // $ANTLR start "rule__WasteStore__NameAssignment_1"
    // InternalStl.g:4966:1: rule__WasteStore__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WasteStore__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4970:1: ( ( RULE_ID ) )
            // InternalStl.g:4971:2: ( RULE_ID )
            {
            // InternalStl.g:4971:2: ( RULE_ID )
            // InternalStl.g:4972:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__NameAssignment_1"


    // $ANTLR start "rule__WasteStore__CostAssignment_3"
    // InternalStl.g:4981:1: rule__WasteStore__CostAssignment_3 : ( ruleEInt ) ;
    public final void rule__WasteStore__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4985:1: ( ( ruleEInt ) )
            // InternalStl.g:4986:2: ( ruleEInt )
            {
            // InternalStl.g:4986:2: ( ruleEInt )
            // InternalStl.g:4987:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getCostEIntParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getCostEIntParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__CostAssignment_3"


    // $ANTLR start "rule__WasteStore__CapacityAssignment_5"
    // InternalStl.g:4996:1: rule__WasteStore__CapacityAssignment_5 : ( ruleEInt ) ;
    public final void rule__WasteStore__CapacityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5000:1: ( ( ruleEInt ) )
            // InternalStl.g:5001:2: ( ruleEInt )
            {
            // InternalStl.g:5001:2: ( ruleEInt )
            // InternalStl.g:5002:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getCapacityEIntParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getCapacityEIntParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__CapacityAssignment_5"


    // $ANTLR start "rule__WasteStore__InputSlotsAssignment_8"
    // InternalStl.g:5011:1: rule__WasteStore__InputSlotsAssignment_8 : ( ruleSlot ) ;
    public final void rule__WasteStore__InputSlotsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5015:1: ( ( ruleSlot ) )
            // InternalStl.g:5016:2: ( ruleSlot )
            {
            // InternalStl.g:5016:2: ( ruleSlot )
            // InternalStl.g:5017:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getInputSlotsSlotParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getInputSlotsSlotParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__InputSlotsAssignment_8"


    // $ANTLR start "rule__WasteStore__ServicesAssignment_9"
    // InternalStl.g:5026:1: rule__WasteStore__ServicesAssignment_9 : ( ruleService ) ;
    public final void rule__WasteStore__ServicesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5030:1: ( ( ruleService ) )
            // InternalStl.g:5031:2: ( ruleService )
            {
            // InternalStl.g:5031:2: ( ruleService )
            // InternalStl.g:5032:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getServicesServiceParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getServicesServiceParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__ServicesAssignment_9"


    // $ANTLR start "rule__Buffer__NameAssignment_1"
    // InternalStl.g:5041:1: rule__Buffer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Buffer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5045:1: ( ( RULE_ID ) )
            // InternalStl.g:5046:2: ( RULE_ID )
            {
            // InternalStl.g:5046:2: ( RULE_ID )
            // InternalStl.g:5047:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__NameAssignment_1"


    // $ANTLR start "rule__Buffer__CostAssignment_3"
    // InternalStl.g:5056:1: rule__Buffer__CostAssignment_3 : ( ruleEInt ) ;
    public final void rule__Buffer__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5060:1: ( ( ruleEInt ) )
            // InternalStl.g:5061:2: ( ruleEInt )
            {
            // InternalStl.g:5061:2: ( ruleEInt )
            // InternalStl.g:5062:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getCostEIntParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getCostEIntParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__CostAssignment_3"


    // $ANTLR start "rule__Buffer__InputSlotsAssignment_6"
    // InternalStl.g:5071:1: rule__Buffer__InputSlotsAssignment_6 : ( ruleSlot ) ;
    public final void rule__Buffer__InputSlotsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5075:1: ( ( ruleSlot ) )
            // InternalStl.g:5076:2: ( ruleSlot )
            {
            // InternalStl.g:5076:2: ( ruleSlot )
            // InternalStl.g:5077:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getInputSlotsSlotParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getInputSlotsSlotParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__InputSlotsAssignment_6"


    // $ANTLR start "rule__Buffer__OutputSlotsAssignment_8"
    // InternalStl.g:5086:1: rule__Buffer__OutputSlotsAssignment_8 : ( ruleSlot ) ;
    public final void rule__Buffer__OutputSlotsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5090:1: ( ( ruleSlot ) )
            // InternalStl.g:5091:2: ( ruleSlot )
            {
            // InternalStl.g:5091:2: ( ruleSlot )
            // InternalStl.g:5092:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getOutputSlotsSlotParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getOutputSlotsSlotParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__OutputSlotsAssignment_8"


    // $ANTLR start "rule__Buffer__ServicesAssignment_9"
    // InternalStl.g:5101:1: rule__Buffer__ServicesAssignment_9 : ( ruleService ) ;
    public final void rule__Buffer__ServicesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5105:1: ( ( ruleService ) )
            // InternalStl.g:5106:2: ( ruleService )
            {
            // InternalStl.g:5106:2: ( ruleService )
            // InternalStl.g:5107:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getServicesServiceParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getServicesServiceParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__ServicesAssignment_9"


    // $ANTLR start "rule__Conveyor__NameAssignment_1"
    // InternalStl.g:5116:1: rule__Conveyor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Conveyor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5120:1: ( ( RULE_ID ) )
            // InternalStl.g:5121:2: ( RULE_ID )
            {
            // InternalStl.g:5121:2: ( RULE_ID )
            // InternalStl.g:5122:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__NameAssignment_1"


    // $ANTLR start "rule__Conveyor__CostAssignment_3"
    // InternalStl.g:5131:1: rule__Conveyor__CostAssignment_3 : ( ruleEInt ) ;
    public final void rule__Conveyor__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5135:1: ( ( ruleEInt ) )
            // InternalStl.g:5136:2: ( ruleEInt )
            {
            // InternalStl.g:5136:2: ( ruleEInt )
            // InternalStl.g:5137:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getCostEIntParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getCostEIntParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__CostAssignment_3"


    // $ANTLR start "rule__Conveyor__InputSlotsAssignment_6"
    // InternalStl.g:5146:1: rule__Conveyor__InputSlotsAssignment_6 : ( ruleSlot ) ;
    public final void rule__Conveyor__InputSlotsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5150:1: ( ( ruleSlot ) )
            // InternalStl.g:5151:2: ( ruleSlot )
            {
            // InternalStl.g:5151:2: ( ruleSlot )
            // InternalStl.g:5152:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getInputSlotsSlotParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getInputSlotsSlotParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__InputSlotsAssignment_6"


    // $ANTLR start "rule__Conveyor__OutputSlotsAssignment_8"
    // InternalStl.g:5161:1: rule__Conveyor__OutputSlotsAssignment_8 : ( ruleSlot ) ;
    public final void rule__Conveyor__OutputSlotsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5165:1: ( ( ruleSlot ) )
            // InternalStl.g:5166:2: ( ruleSlot )
            {
            // InternalStl.g:5166:2: ( ruleSlot )
            // InternalStl.g:5167:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getOutputSlotsSlotParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getOutputSlotsSlotParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__OutputSlotsAssignment_8"


    // $ANTLR start "rule__Conveyor__ServicesAssignment_9"
    // InternalStl.g:5176:1: rule__Conveyor__ServicesAssignment_9 : ( ruleService ) ;
    public final void rule__Conveyor__ServicesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5180:1: ( ( ruleService ) )
            // InternalStl.g:5181:2: ( ruleService )
            {
            // InternalStl.g:5181:2: ( ruleService )
            // InternalStl.g:5182:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getServicesServiceParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getServicesServiceParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__ServicesAssignment_9"


    // $ANTLR start "rule__Machine__NameAssignment_1"
    // InternalStl.g:5191:1: rule__Machine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5195:1: ( ( RULE_ID ) )
            // InternalStl.g:5196:2: ( RULE_ID )
            {
            // InternalStl.g:5196:2: ( RULE_ID )
            // InternalStl.g:5197:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__NameAssignment_1"


    // $ANTLR start "rule__Machine__CostAssignment_3"
    // InternalStl.g:5206:1: rule__Machine__CostAssignment_3 : ( ruleEInt ) ;
    public final void rule__Machine__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5210:1: ( ( ruleEInt ) )
            // InternalStl.g:5211:2: ( ruleEInt )
            {
            // InternalStl.g:5211:2: ( ruleEInt )
            // InternalStl.g:5212:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCostEIntParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getCostEIntParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__CostAssignment_3"


    // $ANTLR start "rule__Machine__InputSlotsAssignment_5_1"
    // InternalStl.g:5221:1: rule__Machine__InputSlotsAssignment_5_1 : ( ruleSlot ) ;
    public final void rule__Machine__InputSlotsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5225:1: ( ( ruleSlot ) )
            // InternalStl.g:5226:2: ( ruleSlot )
            {
            // InternalStl.g:5226:2: ( ruleSlot )
            // InternalStl.g:5227:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInputSlotsSlotParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInputSlotsSlotParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__InputSlotsAssignment_5_1"


    // $ANTLR start "rule__Machine__OutputSlotsAssignment_6_1"
    // InternalStl.g:5236:1: rule__Machine__OutputSlotsAssignment_6_1 : ( ruleSlot ) ;
    public final void rule__Machine__OutputSlotsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5240:1: ( ( ruleSlot ) )
            // InternalStl.g:5241:2: ( ruleSlot )
            {
            // InternalStl.g:5241:2: ( ruleSlot )
            // InternalStl.g:5242:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOutputSlotsSlotParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOutputSlotsSlotParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__OutputSlotsAssignment_6_1"


    // $ANTLR start "rule__Machine__ServicesAssignment_7"
    // InternalStl.g:5251:1: rule__Machine__ServicesAssignment_7 : ( ruleService ) ;
    public final void rule__Machine__ServicesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5255:1: ( ( ruleService ) )
            // InternalStl.g:5256:2: ( ruleService )
            {
            // InternalStl.g:5256:2: ( ruleService )
            // InternalStl.g:5257:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getServicesServiceParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getServicesServiceParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__ServicesAssignment_7"


    // $ANTLR start "rule__TurnTable__NameAssignment_1"
    // InternalStl.g:5266:1: rule__TurnTable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TurnTable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5270:1: ( ( RULE_ID ) )
            // InternalStl.g:5271:2: ( RULE_ID )
            {
            // InternalStl.g:5271:2: ( RULE_ID )
            // InternalStl.g:5272:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__NameAssignment_1"


    // $ANTLR start "rule__TurnTable__CostAssignment_3"
    // InternalStl.g:5281:1: rule__TurnTable__CostAssignment_3 : ( ruleEInt ) ;
    public final void rule__TurnTable__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5285:1: ( ( ruleEInt ) )
            // InternalStl.g:5286:2: ( ruleEInt )
            {
            // InternalStl.g:5286:2: ( ruleEInt )
            // InternalStl.g:5287:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getCostEIntParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getCostEIntParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__CostAssignment_3"


    // $ANTLR start "rule__TurnTable__InputSlotsAssignment_5_1"
    // InternalStl.g:5296:1: rule__TurnTable__InputSlotsAssignment_5_1 : ( ruleSlot ) ;
    public final void rule__TurnTable__InputSlotsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5300:1: ( ( ruleSlot ) )
            // InternalStl.g:5301:2: ( ruleSlot )
            {
            // InternalStl.g:5301:2: ( ruleSlot )
            // InternalStl.g:5302:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getInputSlotsSlotParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getInputSlotsSlotParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__InputSlotsAssignment_5_1"


    // $ANTLR start "rule__TurnTable__OutputSlotsAssignment_6_1"
    // InternalStl.g:5311:1: rule__TurnTable__OutputSlotsAssignment_6_1 : ( ruleSlot ) ;
    public final void rule__TurnTable__OutputSlotsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5315:1: ( ( ruleSlot ) )
            // InternalStl.g:5316:2: ( ruleSlot )
            {
            // InternalStl.g:5316:2: ( ruleSlot )
            // InternalStl.g:5317:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getOutputSlotsSlotParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getOutputSlotsSlotParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__OutputSlotsAssignment_6_1"


    // $ANTLR start "rule__TurnTable__ServicesAssignment_7"
    // InternalStl.g:5326:1: rule__TurnTable__ServicesAssignment_7 : ( ruleService ) ;
    public final void rule__TurnTable__ServicesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5330:1: ( ( ruleService ) )
            // InternalStl.g:5331:2: ( ruleService )
            {
            // InternalStl.g:5331:2: ( ruleService )
            // InternalStl.g:5332:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getServicesServiceParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getServicesServiceParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__ServicesAssignment_7"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\24\1\5\1\25\2\6\1\26\2\6\1\46\1\6\1\13\4\6\1\27\1\6\1\30\2\uffff";
    static final String dfa_3s = "\1\24\1\5\1\25\1\47\1\6\1\26\1\47\2\46\1\6\1\27\3\47\1\6\1\27\1\6\1\31\2\uffff";
    static final String dfa_4s = "\22\uffff\1\1\1\2";
    static final String dfa_5s = "\24\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\40\uffff\1\4",
            "\1\5",
            "\1\6",
            "\1\10\37\uffff\1\11\1\7",
            "\1\10\37\uffff\1\11",
            "\1\11",
            "\1\12",
            "\1\13\1\14\12\uffff\1\15",
            "\1\17\40\uffff\1\16",
            "\1\17\40\uffff\1\16",
            "\1\21\40\uffff\1\20",
            "\1\17",
            "\1\15",
            "\1\21",
            "\1\22\1\23",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "598:1: rule__Service__Alternatives : ( ( ( rule__Service__Group_0__0 ) ) | ( ( rule__Service__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000003E90008020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000003E90000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000C000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001800L});

}