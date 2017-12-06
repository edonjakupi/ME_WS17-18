<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="STL2AML"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchSystem2CAEX():V"/>
		<constant value="A.__matchArea2InternalElement():V"/>
		<constant value="A.__matchComponent2InternalElementWithCost():V"/>
		<constant value="A.__matchStorage2InternalElementWithCapacity():V"/>
		<constant value="A.__matchSlot2ExternalInterface():V"/>
		<constant value="A.__matchConnector2InternalLink():V"/>
		<constant value="__exec__"/>
		<constant value="System2CAEX"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applySystem2CAEX(NTransientLink;):V"/>
		<constant value="Area2InternalElement"/>
		<constant value="A.__applyArea2InternalElement(NTransientLink;):V"/>
		<constant value="Component2InternalElementWithCost"/>
		<constant value="A.__applyComponent2InternalElementWithCost(NTransientLink;):V"/>
		<constant value="Storage2InternalElementWithCapacity"/>
		<constant value="A.__applyStorage2InternalElementWithCapacity(NTransientLink;):V"/>
		<constant value="Slot2ExternalInterface"/>
		<constant value="A.__applySlot2ExternalInterface(NTransientLink;):V"/>
		<constant value="Connector2InternalLink"/>
		<constant value="A.__applyConnector2InternalLink(NTransientLink;):V"/>
		<constant value="__matchSystem2CAEX"/>
		<constant value="System"/>
		<constant value="STL"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="i1"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="__applySystem2CAEX"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="link"/>
		<constant value="__matchArea2InternalElement"/>
		<constant value="Area"/>
		<constant value="__applyArea2InternalElement"/>
		<constant value="__matchComponent2InternalElementWithCost"/>
		<constant value="Component"/>
		<constant value="__applyComponent2InternalElementWithCost"/>
		<constant value="__matchStorage2InternalElementWithCapacity"/>
		<constant value="Store"/>
		<constant value="__applyStorage2InternalElementWithCapacity"/>
		<constant value="__matchSlot2ExternalInterface"/>
		<constant value="Slot"/>
		<constant value="o1"/>
		<constant value="ExternalInterface"/>
		<constant value="AML"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="36:3-36:28"/>
		<constant value="__applySlot2ExternalInterface"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="__matchConnector2InternalLink"/>
		<constant value="Connector"/>
		<constant value="__applyConnector2InternalLink"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
			<getasm/>
			<pcall arg="43"/>
			<getasm/>
			<pcall arg="44"/>
			<getasm/>
			<pcall arg="45"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="11"/>
		</localvariabletable>
	</operation>
	<operation name="46">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="47"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="49"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="51"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="53"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="54"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="55"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="57"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="58"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="59"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="1" name="33" begin="35" end="38"/>
			<lve slot="1" name="33" begin="45" end="48"/>
			<lve slot="1" name="33" begin="55" end="58"/>
			<lve slot="0" name="17" begin="0" end="59"/>
		</localvariabletable>
	</operation>
	<operation name="60">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="61"/>
			<push arg="62"/>
			<findme/>
			<push arg="63"/>
			<call arg="64"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="65"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="47"/>
			<pcall arg="66"/>
			<dup/>
			<push arg="67"/>
			<load arg="19"/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="67" begin="6" end="20"/>
			<lve slot="0" name="17" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="70">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="71"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="67"/>
			<call arg="72"/>
			<store arg="29"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="67" begin="3" end="3"/>
			<lve slot="0" name="17" begin="0" end="3"/>
			<lve slot="1" name="73" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="74">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="75"/>
			<push arg="62"/>
			<findme/>
			<push arg="63"/>
			<call arg="64"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="65"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="50"/>
			<pcall arg="66"/>
			<dup/>
			<push arg="67"/>
			<load arg="19"/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="67" begin="6" end="20"/>
			<lve slot="0" name="17" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="76">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="71"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="67"/>
			<call arg="72"/>
			<store arg="29"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="67" begin="3" end="3"/>
			<lve slot="0" name="17" begin="0" end="3"/>
			<lve slot="1" name="73" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="77">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="78"/>
			<push arg="62"/>
			<findme/>
			<push arg="63"/>
			<call arg="64"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="65"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="52"/>
			<pcall arg="66"/>
			<dup/>
			<push arg="67"/>
			<load arg="19"/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="67" begin="6" end="20"/>
			<lve slot="0" name="17" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="79">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="71"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="67"/>
			<call arg="72"/>
			<store arg="29"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="67" begin="3" end="3"/>
			<lve slot="0" name="17" begin="0" end="3"/>
			<lve slot="1" name="73" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="80">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="81"/>
			<push arg="62"/>
			<findme/>
			<push arg="63"/>
			<call arg="64"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="65"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="54"/>
			<pcall arg="66"/>
			<dup/>
			<push arg="67"/>
			<load arg="19"/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="67" begin="6" end="20"/>
			<lve slot="0" name="17" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="82">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="71"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="67"/>
			<call arg="72"/>
			<store arg="29"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="67" begin="3" end="3"/>
			<lve slot="0" name="17" begin="0" end="3"/>
			<lve slot="1" name="73" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="83">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="84"/>
			<push arg="62"/>
			<findme/>
			<push arg="63"/>
			<call arg="64"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="65"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="56"/>
			<pcall arg="66"/>
			<dup/>
			<push arg="67"/>
			<load arg="19"/>
			<pcall arg="68"/>
			<dup/>
			<push arg="85"/>
			<push arg="86"/>
			<push arg="87"/>
			<new/>
			<pcall arg="88"/>
			<pusht/>
			<pcall arg="69"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="89" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="67" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="90">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="71"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="67"/>
			<call arg="72"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="85"/>
			<call arg="91"/>
			<store arg="92"/>
			<load arg="92"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="89" begin="8" end="9"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="85" begin="7" end="9"/>
			<lve slot="2" name="67" begin="3" end="9"/>
			<lve slot="0" name="17" begin="0" end="9"/>
			<lve slot="1" name="73" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="93">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="94"/>
			<push arg="62"/>
			<findme/>
			<push arg="63"/>
			<call arg="64"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="65"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="58"/>
			<pcall arg="66"/>
			<dup/>
			<push arg="67"/>
			<load arg="19"/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="67" begin="6" end="20"/>
			<lve slot="0" name="17" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="95">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="71"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="67"/>
			<call arg="72"/>
			<store arg="29"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="67" begin="3" end="3"/>
			<lve slot="0" name="17" begin="0" end="3"/>
			<lve slot="1" name="73" begin="0" end="3"/>
		</localvariabletable>
	</operation>
</asm>
