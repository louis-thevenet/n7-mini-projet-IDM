package fr.n7.ide.contentassist.antlr.internal;

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
import fr.n7.services.PDL3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL3Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'f2s'", "'f2f'", "'s2s'", "'s2f'", "'process'", "':'", "'resources'", "'workdefinitions'", "'resourceusages'", "'worksequences'", "';'", "'='"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDL3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL3.g"; }


    	private PDL3GrammarAccess grammarAccess;

    	public void setGrammarAccess(PDL3GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalPDL3.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL3.g:54:1: ( ruleProcess EOF )
            // InternalPDL3.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL3.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL3.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL3.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL3.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL3.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL3.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleResourceUsages"
    // InternalPDL3.g:78:1: entryRuleResourceUsages : ruleResourceUsages EOF ;
    public final void entryRuleResourceUsages() throws RecognitionException {
        try {
            // InternalPDL3.g:79:1: ( ruleResourceUsages EOF )
            // InternalPDL3.g:80:1: ruleResourceUsages EOF
            {
             before(grammarAccess.getResourceUsagesRule()); 
            pushFollow(FOLLOW_1);
            ruleResourceUsages();

            state._fsp--;

             after(grammarAccess.getResourceUsagesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResourceUsages"


    // $ANTLR start "ruleResourceUsages"
    // InternalPDL3.g:87:1: ruleResourceUsages : ( ( rule__ResourceUsages__Group__0 ) ) ;
    public final void ruleResourceUsages() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:91:2: ( ( ( rule__ResourceUsages__Group__0 ) ) )
            // InternalPDL3.g:92:2: ( ( rule__ResourceUsages__Group__0 ) )
            {
            // InternalPDL3.g:92:2: ( ( rule__ResourceUsages__Group__0 ) )
            // InternalPDL3.g:93:3: ( rule__ResourceUsages__Group__0 )
            {
             before(grammarAccess.getResourceUsagesAccess().getGroup()); 
            // InternalPDL3.g:94:3: ( rule__ResourceUsages__Group__0 )
            // InternalPDL3.g:94:4: rule__ResourceUsages__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ResourceUsages__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceUsagesAccess().getGroup()); 

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
    // $ANTLR end "ruleResourceUsages"


    // $ANTLR start "entryRuleResourceUsage"
    // InternalPDL3.g:103:1: entryRuleResourceUsage : ruleResourceUsage EOF ;
    public final void entryRuleResourceUsage() throws RecognitionException {
        try {
            // InternalPDL3.g:104:1: ( ruleResourceUsage EOF )
            // InternalPDL3.g:105:1: ruleResourceUsage EOF
            {
             before(grammarAccess.getResourceUsageRule()); 
            pushFollow(FOLLOW_1);
            ruleResourceUsage();

            state._fsp--;

             after(grammarAccess.getResourceUsageRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResourceUsage"


    // $ANTLR start "ruleResourceUsage"
    // InternalPDL3.g:112:1: ruleResourceUsage : ( ( rule__ResourceUsage__Group__0 ) ) ;
    public final void ruleResourceUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:116:2: ( ( ( rule__ResourceUsage__Group__0 ) ) )
            // InternalPDL3.g:117:2: ( ( rule__ResourceUsage__Group__0 ) )
            {
            // InternalPDL3.g:117:2: ( ( rule__ResourceUsage__Group__0 ) )
            // InternalPDL3.g:118:3: ( rule__ResourceUsage__Group__0 )
            {
             before(grammarAccess.getResourceUsageAccess().getGroup()); 
            // InternalPDL3.g:119:3: ( rule__ResourceUsage__Group__0 )
            // InternalPDL3.g:119:4: rule__ResourceUsage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ResourceUsage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceUsageAccess().getGroup()); 

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
    // $ANTLR end "ruleResourceUsage"


    // $ANTLR start "entryRuleResources"
    // InternalPDL3.g:128:1: entryRuleResources : ruleResources EOF ;
    public final void entryRuleResources() throws RecognitionException {
        try {
            // InternalPDL3.g:129:1: ( ruleResources EOF )
            // InternalPDL3.g:130:1: ruleResources EOF
            {
             before(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_1);
            ruleResources();

            state._fsp--;

             after(grammarAccess.getResourcesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // InternalPDL3.g:137:1: ruleResources : ( ( rule__Resources__Group__0 ) ) ;
    public final void ruleResources() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:141:2: ( ( ( rule__Resources__Group__0 ) ) )
            // InternalPDL3.g:142:2: ( ( rule__Resources__Group__0 ) )
            {
            // InternalPDL3.g:142:2: ( ( rule__Resources__Group__0 ) )
            // InternalPDL3.g:143:3: ( rule__Resources__Group__0 )
            {
             before(grammarAccess.getResourcesAccess().getGroup()); 
            // InternalPDL3.g:144:3: ( rule__Resources__Group__0 )
            // InternalPDL3.g:144:4: rule__Resources__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resources__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getGroup()); 

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
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleResource"
    // InternalPDL3.g:153:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalPDL3.g:154:1: ( ruleResource EOF )
            // InternalPDL3.g:155:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalPDL3.g:162:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:166:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalPDL3.g:167:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalPDL3.g:167:2: ( ( rule__Resource__Group__0 ) )
            // InternalPDL3.g:168:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalPDL3.g:169:3: ( rule__Resource__Group__0 )
            // InternalPDL3.g:169:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleWorkDefinitions"
    // InternalPDL3.g:178:1: entryRuleWorkDefinitions : ruleWorkDefinitions EOF ;
    public final void entryRuleWorkDefinitions() throws RecognitionException {
        try {
            // InternalPDL3.g:179:1: ( ruleWorkDefinitions EOF )
            // InternalPDL3.g:180:1: ruleWorkDefinitions EOF
            {
             before(grammarAccess.getWorkDefinitionsRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinitions();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkDefinitions"


    // $ANTLR start "ruleWorkDefinitions"
    // InternalPDL3.g:187:1: ruleWorkDefinitions : ( ( rule__WorkDefinitions__Group__0 ) ) ;
    public final void ruleWorkDefinitions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:191:2: ( ( ( rule__WorkDefinitions__Group__0 ) ) )
            // InternalPDL3.g:192:2: ( ( rule__WorkDefinitions__Group__0 ) )
            {
            // InternalPDL3.g:192:2: ( ( rule__WorkDefinitions__Group__0 ) )
            // InternalPDL3.g:193:3: ( rule__WorkDefinitions__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionsAccess().getGroup()); 
            // InternalPDL3.g:194:3: ( rule__WorkDefinitions__Group__0 )
            // InternalPDL3.g:194:4: rule__WorkDefinitions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinitions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionsAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkDefinitions"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL3.g:203:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalPDL3.g:204:1: ( ruleWorkDefinition EOF )
            // InternalPDL3.g:205:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL3.g:212:1: ruleWorkDefinition : ( ( rule__WorkDefinition__NameAssignment ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:216:2: ( ( ( rule__WorkDefinition__NameAssignment ) ) )
            // InternalPDL3.g:217:2: ( ( rule__WorkDefinition__NameAssignment ) )
            {
            // InternalPDL3.g:217:2: ( ( rule__WorkDefinition__NameAssignment ) )
            // InternalPDL3.g:218:3: ( rule__WorkDefinition__NameAssignment )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment()); 
            // InternalPDL3.g:219:3: ( rule__WorkDefinition__NameAssignment )
            // InternalPDL3.g:219:4: rule__WorkDefinition__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequences"
    // InternalPDL3.g:228:1: entryRuleWorkSequences : ruleWorkSequences EOF ;
    public final void entryRuleWorkSequences() throws RecognitionException {
        try {
            // InternalPDL3.g:229:1: ( ruleWorkSequences EOF )
            // InternalPDL3.g:230:1: ruleWorkSequences EOF
            {
             before(grammarAccess.getWorkSequencesRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequences();

            state._fsp--;

             after(grammarAccess.getWorkSequencesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkSequences"


    // $ANTLR start "ruleWorkSequences"
    // InternalPDL3.g:237:1: ruleWorkSequences : ( ( rule__WorkSequences__Group__0 ) ) ;
    public final void ruleWorkSequences() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:241:2: ( ( ( rule__WorkSequences__Group__0 ) ) )
            // InternalPDL3.g:242:2: ( ( rule__WorkSequences__Group__0 ) )
            {
            // InternalPDL3.g:242:2: ( ( rule__WorkSequences__Group__0 ) )
            // InternalPDL3.g:243:3: ( rule__WorkSequences__Group__0 )
            {
             before(grammarAccess.getWorkSequencesAccess().getGroup()); 
            // InternalPDL3.g:244:3: ( rule__WorkSequences__Group__0 )
            // InternalPDL3.g:244:4: rule__WorkSequences__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequences__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequencesAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkSequences"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL3.g:253:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDL3.g:254:1: ( ruleWorkSequence EOF )
            // InternalPDL3.g:255:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL3.g:262:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:266:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDL3.g:267:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDL3.g:267:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDL3.g:268:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDL3.g:269:3: ( rule__WorkSequence__Group__0 )
            // InternalPDL3.g:269:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "ruleWorkSequenceKind"
    // InternalPDL3.g:278:1: ruleWorkSequenceKind : ( ( rule__WorkSequenceKind__Alternatives ) ) ;
    public final void ruleWorkSequenceKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:282:1: ( ( ( rule__WorkSequenceKind__Alternatives ) ) )
            // InternalPDL3.g:283:2: ( ( rule__WorkSequenceKind__Alternatives ) )
            {
            // InternalPDL3.g:283:2: ( ( rule__WorkSequenceKind__Alternatives ) )
            // InternalPDL3.g:284:3: ( rule__WorkSequenceKind__Alternatives )
            {
             before(grammarAccess.getWorkSequenceKindAccess().getAlternatives()); 
            // InternalPDL3.g:285:3: ( rule__WorkSequenceKind__Alternatives )
            // InternalPDL3.g:285:4: rule__WorkSequenceKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWorkSequenceKind"


    // $ANTLR start "rule__WorkSequenceKind__Alternatives"
    // InternalPDL3.g:293:1: rule__WorkSequenceKind__Alternatives : ( ( ( 'f2s' ) ) | ( ( 'f2f' ) ) | ( ( 's2s' ) ) | ( ( 's2f' ) ) );
    public final void rule__WorkSequenceKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:297:1: ( ( ( 'f2s' ) ) | ( ( 'f2f' ) ) | ( ( 's2s' ) ) | ( ( 's2f' ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPDL3.g:298:2: ( ( 'f2s' ) )
                    {
                    // InternalPDL3.g:298:2: ( ( 'f2s' ) )
                    // InternalPDL3.g:299:3: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceKindAccess().getFinishToStartEnumLiteralDeclaration_0()); 
                    // InternalPDL3.g:300:3: ( 'f2s' )
                    // InternalPDL3.g:300:4: 'f2s'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceKindAccess().getFinishToStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL3.g:304:2: ( ( 'f2f' ) )
                    {
                    // InternalPDL3.g:304:2: ( ( 'f2f' ) )
                    // InternalPDL3.g:305:3: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceKindAccess().getFinishToFinishEnumLiteralDeclaration_1()); 
                    // InternalPDL3.g:306:3: ( 'f2f' )
                    // InternalPDL3.g:306:4: 'f2f'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceKindAccess().getFinishToFinishEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL3.g:310:2: ( ( 's2s' ) )
                    {
                    // InternalPDL3.g:310:2: ( ( 's2s' ) )
                    // InternalPDL3.g:311:3: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceKindAccess().getStartToStartEnumLiteralDeclaration_2()); 
                    // InternalPDL3.g:312:3: ( 's2s' )
                    // InternalPDL3.g:312:4: 's2s'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceKindAccess().getStartToStartEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL3.g:316:2: ( ( 's2f' ) )
                    {
                    // InternalPDL3.g:316:2: ( ( 's2f' ) )
                    // InternalPDL3.g:317:3: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceKindAccess().getStartToFinishEnumLiteralDeclaration_3()); 
                    // InternalPDL3.g:318:3: ( 's2f' )
                    // InternalPDL3.g:318:4: 's2f'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceKindAccess().getStartToFinishEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__WorkSequenceKind__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalPDL3.g:326:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:330:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL3.g:331:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalPDL3.g:338:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:342:1: ( ( 'process' ) )
            // InternalPDL3.g:343:1: ( 'process' )
            {
            // InternalPDL3.g:343:1: ( 'process' )
            // InternalPDL3.g:344:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

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
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalPDL3.g:353:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:357:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL3.g:358:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalPDL3.g:365:1: rule__Process__Group__1__Impl : ( ':' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:369:1: ( ( ':' ) )
            // InternalPDL3.g:370:1: ( ':' )
            {
            // InternalPDL3.g:370:1: ( ':' )
            // InternalPDL3.g:371:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalPDL3.g:380:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:384:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL3.g:385:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalPDL3.g:392:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:396:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // InternalPDL3.g:397:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // InternalPDL3.g:397:1: ( ( rule__Process__NameAssignment_2 ) )
            // InternalPDL3.g:398:2: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // InternalPDL3.g:399:2: ( rule__Process__NameAssignment_2 )
            // InternalPDL3.g:399:3: rule__Process__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalPDL3.g:407:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:411:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL3.g:412:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalPDL3.g:419:1: rule__Process__Group__3__Impl : ( 'resources' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:423:1: ( ( 'resources' ) )
            // InternalPDL3.g:424:1: ( 'resources' )
            {
            // InternalPDL3.g:424:1: ( 'resources' )
            // InternalPDL3.g:425:2: 'resources'
            {
             before(grammarAccess.getProcessAccess().getResourcesKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getResourcesKeyword_3()); 

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
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalPDL3.g:434:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:438:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalPDL3.g:439:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalPDL3.g:446:1: rule__Process__Group__4__Impl : ( ':' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:450:1: ( ( ':' ) )
            // InternalPDL3.g:451:1: ( ':' )
            {
            // InternalPDL3.g:451:1: ( ':' )
            // InternalPDL3.g:452:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalPDL3.g:461:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:465:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // InternalPDL3.g:466:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalPDL3.g:473:1: rule__Process__Group__5__Impl : ( ( rule__Process__ProcessElementsAssignment_5 )* ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:477:1: ( ( ( rule__Process__ProcessElementsAssignment_5 )* ) )
            // InternalPDL3.g:478:1: ( ( rule__Process__ProcessElementsAssignment_5 )* )
            {
            // InternalPDL3.g:478:1: ( ( rule__Process__ProcessElementsAssignment_5 )* )
            // InternalPDL3.g:479:2: ( rule__Process__ProcessElementsAssignment_5 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_5()); 
            // InternalPDL3.g:480:2: ( rule__Process__ProcessElementsAssignment_5 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPDL3.g:480:3: rule__Process__ProcessElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__ProcessElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_5()); 

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
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // InternalPDL3.g:488:1: rule__Process__Group__6 : rule__Process__Group__6__Impl rule__Process__Group__7 ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:492:1: ( rule__Process__Group__6__Impl rule__Process__Group__7 )
            // InternalPDL3.g:493:2: rule__Process__Group__6__Impl rule__Process__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // InternalPDL3.g:500:1: rule__Process__Group__6__Impl : ( 'workdefinitions' ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:504:1: ( ( 'workdefinitions' ) )
            // InternalPDL3.g:505:1: ( 'workdefinitions' )
            {
            // InternalPDL3.g:505:1: ( 'workdefinitions' )
            // InternalPDL3.g:506:2: 'workdefinitions'
            {
             before(grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_6()); 

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
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Process__Group__7"
    // InternalPDL3.g:515:1: rule__Process__Group__7 : rule__Process__Group__7__Impl rule__Process__Group__8 ;
    public final void rule__Process__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:519:1: ( rule__Process__Group__7__Impl rule__Process__Group__8 )
            // InternalPDL3.g:520:2: rule__Process__Group__7__Impl rule__Process__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__7"


    // $ANTLR start "rule__Process__Group__7__Impl"
    // InternalPDL3.g:527:1: rule__Process__Group__7__Impl : ( ':' ) ;
    public final void rule__Process__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:531:1: ( ( ':' ) )
            // InternalPDL3.g:532:1: ( ':' )
            {
            // InternalPDL3.g:532:1: ( ':' )
            // InternalPDL3.g:533:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_7()); 

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
    // $ANTLR end "rule__Process__Group__7__Impl"


    // $ANTLR start "rule__Process__Group__8"
    // InternalPDL3.g:542:1: rule__Process__Group__8 : rule__Process__Group__8__Impl rule__Process__Group__9 ;
    public final void rule__Process__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:546:1: ( rule__Process__Group__8__Impl rule__Process__Group__9 )
            // InternalPDL3.g:547:2: rule__Process__Group__8__Impl rule__Process__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__8"


    // $ANTLR start "rule__Process__Group__8__Impl"
    // InternalPDL3.g:554:1: rule__Process__Group__8__Impl : ( ( rule__Process__ProcessElementsAssignment_8 )* ) ;
    public final void rule__Process__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:558:1: ( ( ( rule__Process__ProcessElementsAssignment_8 )* ) )
            // InternalPDL3.g:559:1: ( ( rule__Process__ProcessElementsAssignment_8 )* )
            {
            // InternalPDL3.g:559:1: ( ( rule__Process__ProcessElementsAssignment_8 )* )
            // InternalPDL3.g:560:2: ( rule__Process__ProcessElementsAssignment_8 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_8()); 
            // InternalPDL3.g:561:2: ( rule__Process__ProcessElementsAssignment_8 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPDL3.g:561:3: rule__Process__ProcessElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__ProcessElementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_8()); 

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
    // $ANTLR end "rule__Process__Group__8__Impl"


    // $ANTLR start "rule__Process__Group__9"
    // InternalPDL3.g:569:1: rule__Process__Group__9 : rule__Process__Group__9__Impl rule__Process__Group__10 ;
    public final void rule__Process__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:573:1: ( rule__Process__Group__9__Impl rule__Process__Group__10 )
            // InternalPDL3.g:574:2: rule__Process__Group__9__Impl rule__Process__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__9"


    // $ANTLR start "rule__Process__Group__9__Impl"
    // InternalPDL3.g:581:1: rule__Process__Group__9__Impl : ( 'resourceusages' ) ;
    public final void rule__Process__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:585:1: ( ( 'resourceusages' ) )
            // InternalPDL3.g:586:1: ( 'resourceusages' )
            {
            // InternalPDL3.g:586:1: ( 'resourceusages' )
            // InternalPDL3.g:587:2: 'resourceusages'
            {
             before(grammarAccess.getProcessAccess().getResourceusagesKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getResourceusagesKeyword_9()); 

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
    // $ANTLR end "rule__Process__Group__9__Impl"


    // $ANTLR start "rule__Process__Group__10"
    // InternalPDL3.g:596:1: rule__Process__Group__10 : rule__Process__Group__10__Impl rule__Process__Group__11 ;
    public final void rule__Process__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:600:1: ( rule__Process__Group__10__Impl rule__Process__Group__11 )
            // InternalPDL3.g:601:2: rule__Process__Group__10__Impl rule__Process__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Process__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__10"


    // $ANTLR start "rule__Process__Group__10__Impl"
    // InternalPDL3.g:608:1: rule__Process__Group__10__Impl : ( ':' ) ;
    public final void rule__Process__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:612:1: ( ( ':' ) )
            // InternalPDL3.g:613:1: ( ':' )
            {
            // InternalPDL3.g:613:1: ( ':' )
            // InternalPDL3.g:614:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_10()); 

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
    // $ANTLR end "rule__Process__Group__10__Impl"


    // $ANTLR start "rule__Process__Group__11"
    // InternalPDL3.g:623:1: rule__Process__Group__11 : rule__Process__Group__11__Impl rule__Process__Group__12 ;
    public final void rule__Process__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:627:1: ( rule__Process__Group__11__Impl rule__Process__Group__12 )
            // InternalPDL3.g:628:2: rule__Process__Group__11__Impl rule__Process__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Process__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__11"


    // $ANTLR start "rule__Process__Group__11__Impl"
    // InternalPDL3.g:635:1: rule__Process__Group__11__Impl : ( ( rule__Process__ProcessElementsAssignment_11 )* ) ;
    public final void rule__Process__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:639:1: ( ( ( rule__Process__ProcessElementsAssignment_11 )* ) )
            // InternalPDL3.g:640:1: ( ( rule__Process__ProcessElementsAssignment_11 )* )
            {
            // InternalPDL3.g:640:1: ( ( rule__Process__ProcessElementsAssignment_11 )* )
            // InternalPDL3.g:641:2: ( rule__Process__ProcessElementsAssignment_11 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_11()); 
            // InternalPDL3.g:642:2: ( rule__Process__ProcessElementsAssignment_11 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPDL3.g:642:3: rule__Process__ProcessElementsAssignment_11
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__ProcessElementsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_11()); 

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
    // $ANTLR end "rule__Process__Group__11__Impl"


    // $ANTLR start "rule__Process__Group__12"
    // InternalPDL3.g:650:1: rule__Process__Group__12 : rule__Process__Group__12__Impl rule__Process__Group__13 ;
    public final void rule__Process__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:654:1: ( rule__Process__Group__12__Impl rule__Process__Group__13 )
            // InternalPDL3.g:655:2: rule__Process__Group__12__Impl rule__Process__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__12"


    // $ANTLR start "rule__Process__Group__12__Impl"
    // InternalPDL3.g:662:1: rule__Process__Group__12__Impl : ( 'worksequences' ) ;
    public final void rule__Process__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:666:1: ( ( 'worksequences' ) )
            // InternalPDL3.g:667:1: ( 'worksequences' )
            {
            // InternalPDL3.g:667:1: ( 'worksequences' )
            // InternalPDL3.g:668:2: 'worksequences'
            {
             before(grammarAccess.getProcessAccess().getWorksequencesKeyword_12()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorksequencesKeyword_12()); 

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
    // $ANTLR end "rule__Process__Group__12__Impl"


    // $ANTLR start "rule__Process__Group__13"
    // InternalPDL3.g:677:1: rule__Process__Group__13 : rule__Process__Group__13__Impl rule__Process__Group__14 ;
    public final void rule__Process__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:681:1: ( rule__Process__Group__13__Impl rule__Process__Group__14 )
            // InternalPDL3.g:682:2: rule__Process__Group__13__Impl rule__Process__Group__14
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__13"


    // $ANTLR start "rule__Process__Group__13__Impl"
    // InternalPDL3.g:689:1: rule__Process__Group__13__Impl : ( ':' ) ;
    public final void rule__Process__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:693:1: ( ( ':' ) )
            // InternalPDL3.g:694:1: ( ':' )
            {
            // InternalPDL3.g:694:1: ( ':' )
            // InternalPDL3.g:695:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_13()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_13()); 

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
    // $ANTLR end "rule__Process__Group__13__Impl"


    // $ANTLR start "rule__Process__Group__14"
    // InternalPDL3.g:704:1: rule__Process__Group__14 : rule__Process__Group__14__Impl ;
    public final void rule__Process__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:708:1: ( rule__Process__Group__14__Impl )
            // InternalPDL3.g:709:2: rule__Process__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__14"


    // $ANTLR start "rule__Process__Group__14__Impl"
    // InternalPDL3.g:715:1: rule__Process__Group__14__Impl : ( ( rule__Process__ProcessElementsAssignment_14 )* ) ;
    public final void rule__Process__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:719:1: ( ( ( rule__Process__ProcessElementsAssignment_14 )* ) )
            // InternalPDL3.g:720:1: ( ( rule__Process__ProcessElementsAssignment_14 )* )
            {
            // InternalPDL3.g:720:1: ( ( rule__Process__ProcessElementsAssignment_14 )* )
            // InternalPDL3.g:721:2: ( rule__Process__ProcessElementsAssignment_14 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_14()); 
            // InternalPDL3.g:722:2: ( rule__Process__ProcessElementsAssignment_14 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPDL3.g:722:3: rule__Process__ProcessElementsAssignment_14
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__ProcessElementsAssignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_14()); 

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
    // $ANTLR end "rule__Process__Group__14__Impl"


    // $ANTLR start "rule__ResourceUsages__Group__0"
    // InternalPDL3.g:731:1: rule__ResourceUsages__Group__0 : rule__ResourceUsages__Group__0__Impl rule__ResourceUsages__Group__1 ;
    public final void rule__ResourceUsages__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:735:1: ( rule__ResourceUsages__Group__0__Impl rule__ResourceUsages__Group__1 )
            // InternalPDL3.g:736:2: rule__ResourceUsages__Group__0__Impl rule__ResourceUsages__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ResourceUsages__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourceUsages__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceUsages__Group__0"


    // $ANTLR start "rule__ResourceUsages__Group__0__Impl"
    // InternalPDL3.g:743:1: rule__ResourceUsages__Group__0__Impl : ( ruleResourceUsage ) ;
    public final void rule__ResourceUsages__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:747:1: ( ( ruleResourceUsage ) )
            // InternalPDL3.g:748:1: ( ruleResourceUsage )
            {
            // InternalPDL3.g:748:1: ( ruleResourceUsage )
            // InternalPDL3.g:749:2: ruleResourceUsage
            {
             before(grammarAccess.getResourceUsagesAccess().getResourceUsageParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleResourceUsage();

            state._fsp--;

             after(grammarAccess.getResourceUsagesAccess().getResourceUsageParserRuleCall_0()); 

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
    // $ANTLR end "rule__ResourceUsages__Group__0__Impl"


    // $ANTLR start "rule__ResourceUsages__Group__1"
    // InternalPDL3.g:758:1: rule__ResourceUsages__Group__1 : rule__ResourceUsages__Group__1__Impl ;
    public final void rule__ResourceUsages__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:762:1: ( rule__ResourceUsages__Group__1__Impl )
            // InternalPDL3.g:763:2: rule__ResourceUsages__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResourceUsages__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceUsages__Group__1"


    // $ANTLR start "rule__ResourceUsages__Group__1__Impl"
    // InternalPDL3.g:769:1: rule__ResourceUsages__Group__1__Impl : ( ';' ) ;
    public final void rule__ResourceUsages__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:773:1: ( ( ';' ) )
            // InternalPDL3.g:774:1: ( ';' )
            {
            // InternalPDL3.g:774:1: ( ';' )
            // InternalPDL3.g:775:2: ';'
            {
             before(grammarAccess.getResourceUsagesAccess().getSemicolonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getResourceUsagesAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__ResourceUsages__Group__1__Impl"


    // $ANTLR start "rule__ResourceUsage__Group__0"
    // InternalPDL3.g:785:1: rule__ResourceUsage__Group__0 : rule__ResourceUsage__Group__0__Impl rule__ResourceUsage__Group__1 ;
    public final void rule__ResourceUsage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:789:1: ( rule__ResourceUsage__Group__0__Impl rule__ResourceUsage__Group__1 )
            // InternalPDL3.g:790:2: rule__ResourceUsage__Group__0__Impl rule__ResourceUsage__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ResourceUsage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourceUsage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceUsage__Group__0"


    // $ANTLR start "rule__ResourceUsage__Group__0__Impl"
    // InternalPDL3.g:797:1: rule__ResourceUsage__Group__0__Impl : ( ( rule__ResourceUsage__WorkDefinitionAssignment_0 ) ) ;
    public final void rule__ResourceUsage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:801:1: ( ( ( rule__ResourceUsage__WorkDefinitionAssignment_0 ) ) )
            // InternalPDL3.g:802:1: ( ( rule__ResourceUsage__WorkDefinitionAssignment_0 ) )
            {
            // InternalPDL3.g:802:1: ( ( rule__ResourceUsage__WorkDefinitionAssignment_0 ) )
            // InternalPDL3.g:803:2: ( rule__ResourceUsage__WorkDefinitionAssignment_0 )
            {
             before(grammarAccess.getResourceUsageAccess().getWorkDefinitionAssignment_0()); 
            // InternalPDL3.g:804:2: ( rule__ResourceUsage__WorkDefinitionAssignment_0 )
            // InternalPDL3.g:804:3: rule__ResourceUsage__WorkDefinitionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ResourceUsage__WorkDefinitionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResourceUsageAccess().getWorkDefinitionAssignment_0()); 

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
    // $ANTLR end "rule__ResourceUsage__Group__0__Impl"


    // $ANTLR start "rule__ResourceUsage__Group__1"
    // InternalPDL3.g:812:1: rule__ResourceUsage__Group__1 : rule__ResourceUsage__Group__1__Impl rule__ResourceUsage__Group__2 ;
    public final void rule__ResourceUsage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:816:1: ( rule__ResourceUsage__Group__1__Impl rule__ResourceUsage__Group__2 )
            // InternalPDL3.g:817:2: rule__ResourceUsage__Group__1__Impl rule__ResourceUsage__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ResourceUsage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourceUsage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceUsage__Group__1"


    // $ANTLR start "rule__ResourceUsage__Group__1__Impl"
    // InternalPDL3.g:824:1: rule__ResourceUsage__Group__1__Impl : ( ':' ) ;
    public final void rule__ResourceUsage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:828:1: ( ( ':' ) )
            // InternalPDL3.g:829:1: ( ':' )
            {
            // InternalPDL3.g:829:1: ( ':' )
            // InternalPDL3.g:830:2: ':'
            {
             before(grammarAccess.getResourceUsageAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getResourceUsageAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ResourceUsage__Group__1__Impl"


    // $ANTLR start "rule__ResourceUsage__Group__2"
    // InternalPDL3.g:839:1: rule__ResourceUsage__Group__2 : rule__ResourceUsage__Group__2__Impl rule__ResourceUsage__Group__3 ;
    public final void rule__ResourceUsage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:843:1: ( rule__ResourceUsage__Group__2__Impl rule__ResourceUsage__Group__3 )
            // InternalPDL3.g:844:2: rule__ResourceUsage__Group__2__Impl rule__ResourceUsage__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ResourceUsage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourceUsage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceUsage__Group__2"


    // $ANTLR start "rule__ResourceUsage__Group__2__Impl"
    // InternalPDL3.g:851:1: rule__ResourceUsage__Group__2__Impl : ( ( rule__ResourceUsage__ResourceAssignment_2 ) ) ;
    public final void rule__ResourceUsage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:855:1: ( ( ( rule__ResourceUsage__ResourceAssignment_2 ) ) )
            // InternalPDL3.g:856:1: ( ( rule__ResourceUsage__ResourceAssignment_2 ) )
            {
            // InternalPDL3.g:856:1: ( ( rule__ResourceUsage__ResourceAssignment_2 ) )
            // InternalPDL3.g:857:2: ( rule__ResourceUsage__ResourceAssignment_2 )
            {
             before(grammarAccess.getResourceUsageAccess().getResourceAssignment_2()); 
            // InternalPDL3.g:858:2: ( rule__ResourceUsage__ResourceAssignment_2 )
            // InternalPDL3.g:858:3: rule__ResourceUsage__ResourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ResourceUsage__ResourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceUsageAccess().getResourceAssignment_2()); 

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
    // $ANTLR end "rule__ResourceUsage__Group__2__Impl"


    // $ANTLR start "rule__ResourceUsage__Group__3"
    // InternalPDL3.g:866:1: rule__ResourceUsage__Group__3 : rule__ResourceUsage__Group__3__Impl rule__ResourceUsage__Group__4 ;
    public final void rule__ResourceUsage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:870:1: ( rule__ResourceUsage__Group__3__Impl rule__ResourceUsage__Group__4 )
            // InternalPDL3.g:871:2: rule__ResourceUsage__Group__3__Impl rule__ResourceUsage__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ResourceUsage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourceUsage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceUsage__Group__3"


    // $ANTLR start "rule__ResourceUsage__Group__3__Impl"
    // InternalPDL3.g:878:1: rule__ResourceUsage__Group__3__Impl : ( '=' ) ;
    public final void rule__ResourceUsage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:882:1: ( ( '=' ) )
            // InternalPDL3.g:883:1: ( '=' )
            {
            // InternalPDL3.g:883:1: ( '=' )
            // InternalPDL3.g:884:2: '='
            {
             before(grammarAccess.getResourceUsageAccess().getEqualsSignKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getResourceUsageAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__ResourceUsage__Group__3__Impl"


    // $ANTLR start "rule__ResourceUsage__Group__4"
    // InternalPDL3.g:893:1: rule__ResourceUsage__Group__4 : rule__ResourceUsage__Group__4__Impl ;
    public final void rule__ResourceUsage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:897:1: ( rule__ResourceUsage__Group__4__Impl )
            // InternalPDL3.g:898:2: rule__ResourceUsage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResourceUsage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceUsage__Group__4"


    // $ANTLR start "rule__ResourceUsage__Group__4__Impl"
    // InternalPDL3.g:904:1: rule__ResourceUsage__Group__4__Impl : ( ( rule__ResourceUsage__NeededAssignment_4 ) ) ;
    public final void rule__ResourceUsage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:908:1: ( ( ( rule__ResourceUsage__NeededAssignment_4 ) ) )
            // InternalPDL3.g:909:1: ( ( rule__ResourceUsage__NeededAssignment_4 ) )
            {
            // InternalPDL3.g:909:1: ( ( rule__ResourceUsage__NeededAssignment_4 ) )
            // InternalPDL3.g:910:2: ( rule__ResourceUsage__NeededAssignment_4 )
            {
             before(grammarAccess.getResourceUsageAccess().getNeededAssignment_4()); 
            // InternalPDL3.g:911:2: ( rule__ResourceUsage__NeededAssignment_4 )
            // InternalPDL3.g:911:3: rule__ResourceUsage__NeededAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ResourceUsage__NeededAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getResourceUsageAccess().getNeededAssignment_4()); 

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
    // $ANTLR end "rule__ResourceUsage__Group__4__Impl"


    // $ANTLR start "rule__Resources__Group__0"
    // InternalPDL3.g:920:1: rule__Resources__Group__0 : rule__Resources__Group__0__Impl rule__Resources__Group__1 ;
    public final void rule__Resources__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:924:1: ( rule__Resources__Group__0__Impl rule__Resources__Group__1 )
            // InternalPDL3.g:925:2: rule__Resources__Group__0__Impl rule__Resources__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Resources__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__0"


    // $ANTLR start "rule__Resources__Group__0__Impl"
    // InternalPDL3.g:932:1: rule__Resources__Group__0__Impl : ( ruleResource ) ;
    public final void rule__Resources__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:936:1: ( ( ruleResource ) )
            // InternalPDL3.g:937:1: ( ruleResource )
            {
            // InternalPDL3.g:937:1: ( ruleResource )
            // InternalPDL3.g:938:2: ruleResource
            {
             before(grammarAccess.getResourcesAccess().getResourceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourcesAccess().getResourceParserRuleCall_0()); 

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
    // $ANTLR end "rule__Resources__Group__0__Impl"


    // $ANTLR start "rule__Resources__Group__1"
    // InternalPDL3.g:947:1: rule__Resources__Group__1 : rule__Resources__Group__1__Impl ;
    public final void rule__Resources__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:951:1: ( rule__Resources__Group__1__Impl )
            // InternalPDL3.g:952:2: rule__Resources__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resources__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__1"


    // $ANTLR start "rule__Resources__Group__1__Impl"
    // InternalPDL3.g:958:1: rule__Resources__Group__1__Impl : ( ';' ) ;
    public final void rule__Resources__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:962:1: ( ( ';' ) )
            // InternalPDL3.g:963:1: ( ';' )
            {
            // InternalPDL3.g:963:1: ( ';' )
            // InternalPDL3.g:964:2: ';'
            {
             before(grammarAccess.getResourcesAccess().getSemicolonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Resources__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalPDL3.g:974:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:978:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalPDL3.g:979:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalPDL3.g:986:1: rule__Resource__Group__0__Impl : ( ( rule__Resource__NameAssignment_0 ) ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:990:1: ( ( ( rule__Resource__NameAssignment_0 ) ) )
            // InternalPDL3.g:991:1: ( ( rule__Resource__NameAssignment_0 ) )
            {
            // InternalPDL3.g:991:1: ( ( rule__Resource__NameAssignment_0 ) )
            // InternalPDL3.g:992:2: ( rule__Resource__NameAssignment_0 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_0()); 
            // InternalPDL3.g:993:2: ( rule__Resource__NameAssignment_0 )
            // InternalPDL3.g:993:3: rule__Resource__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalPDL3.g:1001:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1005:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalPDL3.g:1006:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalPDL3.g:1013:1: rule__Resource__Group__1__Impl : ( ':' ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1017:1: ( ( ':' ) )
            // InternalPDL3.g:1018:1: ( ':' )
            {
            // InternalPDL3.g:1018:1: ( ':' )
            // InternalPDL3.g:1019:2: ':'
            {
             before(grammarAccess.getResourceAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalPDL3.g:1028:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1032:1: ( rule__Resource__Group__2__Impl )
            // InternalPDL3.g:1033:2: rule__Resource__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalPDL3.g:1039:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__TotalAssignment_2 ) ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1043:1: ( ( ( rule__Resource__TotalAssignment_2 ) ) )
            // InternalPDL3.g:1044:1: ( ( rule__Resource__TotalAssignment_2 ) )
            {
            // InternalPDL3.g:1044:1: ( ( rule__Resource__TotalAssignment_2 ) )
            // InternalPDL3.g:1045:2: ( rule__Resource__TotalAssignment_2 )
            {
             before(grammarAccess.getResourceAccess().getTotalAssignment_2()); 
            // InternalPDL3.g:1046:2: ( rule__Resource__TotalAssignment_2 )
            // InternalPDL3.g:1046:3: rule__Resource__TotalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Resource__TotalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getTotalAssignment_2()); 

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
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinitions__Group__0"
    // InternalPDL3.g:1055:1: rule__WorkDefinitions__Group__0 : rule__WorkDefinitions__Group__0__Impl rule__WorkDefinitions__Group__1 ;
    public final void rule__WorkDefinitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1059:1: ( rule__WorkDefinitions__Group__0__Impl rule__WorkDefinitions__Group__1 )
            // InternalPDL3.g:1060:2: rule__WorkDefinitions__Group__0__Impl rule__WorkDefinitions__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__WorkDefinitions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinitions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinitions__Group__0"


    // $ANTLR start "rule__WorkDefinitions__Group__0__Impl"
    // InternalPDL3.g:1067:1: rule__WorkDefinitions__Group__0__Impl : ( ruleWorkDefinition ) ;
    public final void rule__WorkDefinitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1071:1: ( ( ruleWorkDefinition ) )
            // InternalPDL3.g:1072:1: ( ruleWorkDefinition )
            {
            // InternalPDL3.g:1072:1: ( ruleWorkDefinition )
            // InternalPDL3.g:1073:2: ruleWorkDefinition
            {
             before(grammarAccess.getWorkDefinitionsAccess().getWorkDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionsAccess().getWorkDefinitionParserRuleCall_0()); 

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
    // $ANTLR end "rule__WorkDefinitions__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinitions__Group__1"
    // InternalPDL3.g:1082:1: rule__WorkDefinitions__Group__1 : rule__WorkDefinitions__Group__1__Impl ;
    public final void rule__WorkDefinitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1086:1: ( rule__WorkDefinitions__Group__1__Impl )
            // InternalPDL3.g:1087:2: rule__WorkDefinitions__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinitions__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinitions__Group__1"


    // $ANTLR start "rule__WorkDefinitions__Group__1__Impl"
    // InternalPDL3.g:1093:1: rule__WorkDefinitions__Group__1__Impl : ( ';' ) ;
    public final void rule__WorkDefinitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1097:1: ( ( ';' ) )
            // InternalPDL3.g:1098:1: ( ';' )
            {
            // InternalPDL3.g:1098:1: ( ';' )
            // InternalPDL3.g:1099:2: ';'
            {
             before(grammarAccess.getWorkDefinitionsAccess().getSemicolonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionsAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__WorkDefinitions__Group__1__Impl"


    // $ANTLR start "rule__WorkSequences__Group__0"
    // InternalPDL3.g:1109:1: rule__WorkSequences__Group__0 : rule__WorkSequences__Group__0__Impl rule__WorkSequences__Group__1 ;
    public final void rule__WorkSequences__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1113:1: ( rule__WorkSequences__Group__0__Impl rule__WorkSequences__Group__1 )
            // InternalPDL3.g:1114:2: rule__WorkSequences__Group__0__Impl rule__WorkSequences__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__WorkSequences__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequences__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequences__Group__0"


    // $ANTLR start "rule__WorkSequences__Group__0__Impl"
    // InternalPDL3.g:1121:1: rule__WorkSequences__Group__0__Impl : ( ruleWorkSequence ) ;
    public final void rule__WorkSequences__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1125:1: ( ( ruleWorkSequence ) )
            // InternalPDL3.g:1126:1: ( ruleWorkSequence )
            {
            // InternalPDL3.g:1126:1: ( ruleWorkSequence )
            // InternalPDL3.g:1127:2: ruleWorkSequence
            {
             before(grammarAccess.getWorkSequencesAccess().getWorkSequenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequencesAccess().getWorkSequenceParserRuleCall_0()); 

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
    // $ANTLR end "rule__WorkSequences__Group__0__Impl"


    // $ANTLR start "rule__WorkSequences__Group__1"
    // InternalPDL3.g:1136:1: rule__WorkSequences__Group__1 : rule__WorkSequences__Group__1__Impl ;
    public final void rule__WorkSequences__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1140:1: ( rule__WorkSequences__Group__1__Impl )
            // InternalPDL3.g:1141:2: rule__WorkSequences__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequences__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequences__Group__1"


    // $ANTLR start "rule__WorkSequences__Group__1__Impl"
    // InternalPDL3.g:1147:1: rule__WorkSequences__Group__1__Impl : ( ';' ) ;
    public final void rule__WorkSequences__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1151:1: ( ( ';' ) )
            // InternalPDL3.g:1152:1: ( ';' )
            {
            // InternalPDL3.g:1152:1: ( ';' )
            // InternalPDL3.g:1153:2: ';'
            {
             before(grammarAccess.getWorkSequencesAccess().getSemicolonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkSequencesAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__WorkSequences__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL3.g:1163:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1167:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL3.g:1168:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalPDL3.g:1175:1: rule__WorkSequence__Group__0__Impl : ( ( rule__WorkSequence__LinkToPredecessorAssignment_0 ) ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1179:1: ( ( ( rule__WorkSequence__LinkToPredecessorAssignment_0 ) ) )
            // InternalPDL3.g:1180:1: ( ( rule__WorkSequence__LinkToPredecessorAssignment_0 ) )
            {
            // InternalPDL3.g:1180:1: ( ( rule__WorkSequence__LinkToPredecessorAssignment_0 ) )
            // InternalPDL3.g:1181:2: ( rule__WorkSequence__LinkToPredecessorAssignment_0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkToPredecessorAssignment_0()); 
            // InternalPDL3.g:1182:2: ( rule__WorkSequence__LinkToPredecessorAssignment_0 )
            // InternalPDL3.g:1182:3: rule__WorkSequence__LinkToPredecessorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkToPredecessorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkToPredecessorAssignment_0()); 

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
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalPDL3.g:1190:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1194:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL3.g:1195:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalPDL3.g:1202:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1206:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // InternalPDL3.g:1207:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // InternalPDL3.g:1207:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // InternalPDL3.g:1208:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // InternalPDL3.g:1209:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // InternalPDL3.g:1209:3: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

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
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalPDL3.g:1217:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1221:1: ( rule__WorkSequence__Group__2__Impl )
            // InternalPDL3.g:1222:2: rule__WorkSequence__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalPDL3.g:1228:1: rule__WorkSequence__Group__2__Impl : ( ( rule__WorkSequence__LinkToSucessorAssignment_2 ) ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1232:1: ( ( ( rule__WorkSequence__LinkToSucessorAssignment_2 ) ) )
            // InternalPDL3.g:1233:1: ( ( rule__WorkSequence__LinkToSucessorAssignment_2 ) )
            {
            // InternalPDL3.g:1233:1: ( ( rule__WorkSequence__LinkToSucessorAssignment_2 ) )
            // InternalPDL3.g:1234:2: ( rule__WorkSequence__LinkToSucessorAssignment_2 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkToSucessorAssignment_2()); 
            // InternalPDL3.g:1235:2: ( rule__WorkSequence__LinkToSucessorAssignment_2 )
            // InternalPDL3.g:1235:3: rule__WorkSequence__LinkToSucessorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkToSucessorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkToSucessorAssignment_2()); 

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
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__Process__NameAssignment_2"
    // InternalPDL3.g:1244:1: rule__Process__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1248:1: ( ( RULE_ID ) )
            // InternalPDL3.g:1249:2: ( RULE_ID )
            {
            // InternalPDL3.g:1249:2: ( RULE_ID )
            // InternalPDL3.g:1250:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Process__NameAssignment_2"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_5"
    // InternalPDL3.g:1259:1: rule__Process__ProcessElementsAssignment_5 : ( ruleResources ) ;
    public final void rule__Process__ProcessElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1263:1: ( ( ruleResources ) )
            // InternalPDL3.g:1264:2: ( ruleResources )
            {
            // InternalPDL3.g:1264:2: ( ruleResources )
            // InternalPDL3.g:1265:3: ruleResources
            {
             before(grammarAccess.getProcessAccess().getProcessElementsResourcesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleResources();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsResourcesParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_5"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_8"
    // InternalPDL3.g:1274:1: rule__Process__ProcessElementsAssignment_8 : ( ruleWorkDefinitions ) ;
    public final void rule__Process__ProcessElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1278:1: ( ( ruleWorkDefinitions ) )
            // InternalPDL3.g:1279:2: ( ruleWorkDefinitions )
            {
            // InternalPDL3.g:1279:2: ( ruleWorkDefinitions )
            // InternalPDL3.g:1280:3: ruleWorkDefinitions
            {
             before(grammarAccess.getProcessAccess().getProcessElementsWorkDefinitionsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkDefinitions();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsWorkDefinitionsParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_8"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_11"
    // InternalPDL3.g:1289:1: rule__Process__ProcessElementsAssignment_11 : ( ruleResourceUsages ) ;
    public final void rule__Process__ProcessElementsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1293:1: ( ( ruleResourceUsages ) )
            // InternalPDL3.g:1294:2: ( ruleResourceUsages )
            {
            // InternalPDL3.g:1294:2: ( ruleResourceUsages )
            // InternalPDL3.g:1295:3: ruleResourceUsages
            {
             before(grammarAccess.getProcessAccess().getProcessElementsResourceUsagesParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleResourceUsages();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsResourceUsagesParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_11"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_14"
    // InternalPDL3.g:1304:1: rule__Process__ProcessElementsAssignment_14 : ( ruleWorkSequences ) ;
    public final void rule__Process__ProcessElementsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1308:1: ( ( ruleWorkSequences ) )
            // InternalPDL3.g:1309:2: ( ruleWorkSequences )
            {
            // InternalPDL3.g:1309:2: ( ruleWorkSequences )
            // InternalPDL3.g:1310:3: ruleWorkSequences
            {
             before(grammarAccess.getProcessAccess().getProcessElementsWorkSequencesParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequences();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsWorkSequencesParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_14"


    // $ANTLR start "rule__ResourceUsage__WorkDefinitionAssignment_0"
    // InternalPDL3.g:1319:1: rule__ResourceUsage__WorkDefinitionAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ResourceUsage__WorkDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1323:1: ( ( ( RULE_ID ) ) )
            // InternalPDL3.g:1324:2: ( ( RULE_ID ) )
            {
            // InternalPDL3.g:1324:2: ( ( RULE_ID ) )
            // InternalPDL3.g:1325:3: ( RULE_ID )
            {
             before(grammarAccess.getResourceUsageAccess().getWorkDefinitionWorkDefinitionCrossReference_0_0()); 
            // InternalPDL3.g:1326:3: ( RULE_ID )
            // InternalPDL3.g:1327:4: RULE_ID
            {
             before(grammarAccess.getResourceUsageAccess().getWorkDefinitionWorkDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResourceUsageAccess().getWorkDefinitionWorkDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getResourceUsageAccess().getWorkDefinitionWorkDefinitionCrossReference_0_0()); 

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
    // $ANTLR end "rule__ResourceUsage__WorkDefinitionAssignment_0"


    // $ANTLR start "rule__ResourceUsage__ResourceAssignment_2"
    // InternalPDL3.g:1338:1: rule__ResourceUsage__ResourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ResourceUsage__ResourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1342:1: ( ( ( RULE_ID ) ) )
            // InternalPDL3.g:1343:2: ( ( RULE_ID ) )
            {
            // InternalPDL3.g:1343:2: ( ( RULE_ID ) )
            // InternalPDL3.g:1344:3: ( RULE_ID )
            {
             before(grammarAccess.getResourceUsageAccess().getResourceResourceCrossReference_2_0()); 
            // InternalPDL3.g:1345:3: ( RULE_ID )
            // InternalPDL3.g:1346:4: RULE_ID
            {
             before(grammarAccess.getResourceUsageAccess().getResourceResourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResourceUsageAccess().getResourceResourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getResourceUsageAccess().getResourceResourceCrossReference_2_0()); 

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
    // $ANTLR end "rule__ResourceUsage__ResourceAssignment_2"


    // $ANTLR start "rule__ResourceUsage__NeededAssignment_4"
    // InternalPDL3.g:1357:1: rule__ResourceUsage__NeededAssignment_4 : ( RULE_INT ) ;
    public final void rule__ResourceUsage__NeededAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1361:1: ( ( RULE_INT ) )
            // InternalPDL3.g:1362:2: ( RULE_INT )
            {
            // InternalPDL3.g:1362:2: ( RULE_INT )
            // InternalPDL3.g:1363:3: RULE_INT
            {
             before(grammarAccess.getResourceUsageAccess().getNeededINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getResourceUsageAccess().getNeededINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ResourceUsage__NeededAssignment_4"


    // $ANTLR start "rule__Resource__NameAssignment_0"
    // InternalPDL3.g:1372:1: rule__Resource__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1376:1: ( ( RULE_ID ) )
            // InternalPDL3.g:1377:2: ( RULE_ID )
            {
            // InternalPDL3.g:1377:2: ( RULE_ID )
            // InternalPDL3.g:1378:3: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Resource__NameAssignment_0"


    // $ANTLR start "rule__Resource__TotalAssignment_2"
    // InternalPDL3.g:1387:1: rule__Resource__TotalAssignment_2 : ( RULE_INT ) ;
    public final void rule__Resource__TotalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1391:1: ( ( RULE_INT ) )
            // InternalPDL3.g:1392:2: ( RULE_INT )
            {
            // InternalPDL3.g:1392:2: ( RULE_INT )
            // InternalPDL3.g:1393:3: RULE_INT
            {
             before(grammarAccess.getResourceAccess().getTotalINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getTotalINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Resource__TotalAssignment_2"


    // $ANTLR start "rule__WorkDefinition__NameAssignment"
    // InternalPDL3.g:1402:1: rule__WorkDefinition__NameAssignment : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1406:1: ( ( RULE_ID ) )
            // InternalPDL3.g:1407:2: ( RULE_ID )
            {
            // InternalPDL3.g:1407:2: ( RULE_ID )
            // InternalPDL3.g:1408:3: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__WorkDefinition__NameAssignment"


    // $ANTLR start "rule__WorkSequence__LinkToPredecessorAssignment_0"
    // InternalPDL3.g:1417:1: rule__WorkSequence__LinkToPredecessorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__LinkToPredecessorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1421:1: ( ( ( RULE_ID ) ) )
            // InternalPDL3.g:1422:2: ( ( RULE_ID ) )
            {
            // InternalPDL3.g:1422:2: ( ( RULE_ID ) )
            // InternalPDL3.g:1423:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkToPredecessorWorkDefinitionCrossReference_0_0()); 
            // InternalPDL3.g:1424:3: ( RULE_ID )
            // InternalPDL3.g:1425:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkToPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getLinkToPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getLinkToPredecessorWorkDefinitionCrossReference_0_0()); 

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
    // $ANTLR end "rule__WorkSequence__LinkToPredecessorAssignment_0"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // InternalPDL3.g:1436:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceKind ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1440:1: ( ( ruleWorkSequenceKind ) )
            // InternalPDL3.g:1441:2: ( ruleWorkSequenceKind )
            {
            // InternalPDL3.g:1441:2: ( ruleWorkSequenceKind )
            // InternalPDL3.g:1442:3: ruleWorkSequenceKind
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceKind();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceKindEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__LinkToSucessorAssignment_2"
    // InternalPDL3.g:1451:1: rule__WorkSequence__LinkToSucessorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__LinkToSucessorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1455:1: ( ( ( RULE_ID ) ) )
            // InternalPDL3.g:1456:2: ( ( RULE_ID ) )
            {
            // InternalPDL3.g:1456:2: ( ( RULE_ID ) )
            // InternalPDL3.g:1457:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkToSucessorWorkDefinitionCrossReference_2_0()); 
            // InternalPDL3.g:1458:3: ( RULE_ID )
            // InternalPDL3.g:1459:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkToSucessorWorkDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getLinkToSucessorWorkDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getLinkToSucessorWorkDefinitionCrossReference_2_0()); 

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
    // $ANTLR end "rule__WorkSequence__LinkToSucessorAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000007800L});

}