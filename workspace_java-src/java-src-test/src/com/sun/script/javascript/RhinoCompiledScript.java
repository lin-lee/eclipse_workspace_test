/*
 * %W% %E% %U%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTAIL. Use is subject to license terms.
 */

package com.sun.script.javascript;
import javax.script.*;
import sun.org.mozilla.javascript.internal.*;

/**
 * Represents compiled JavaScript code.
 *
 * @author Mike Grogan
 * @version 1.0
 * @since 1.6
 */
final class RhinoCompiledScript extends CompiledScript {
    
    private RhinoScriptEngine engine;
    private Script script;
    
    
    RhinoCompiledScript(RhinoScriptEngine engine, Script script) {
        this.engine = engine;
        this.script = script;
    }
    
    public Object eval(ScriptContext context) throws ScriptException {
        
        Object result = null;
        Context cx = RhinoScriptEngine.enterContext();
        try {
            
            Scriptable scope = engine.getRuntimeScope(context);
            Object ret = script.exec(cx, scope);
            result = engine.unwrapReturnValue(ret);
            
        } catch (Exception e) {
            throw new ScriptException(e);
        } finally {
            Context.exit();
        }
        
        return result;
    }
    
    public ScriptEngine getEngine() {
        return engine;
    }
    
}
