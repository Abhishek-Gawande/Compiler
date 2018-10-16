/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

@SuppressWarnings("nls")
public final class ACmdsGoal extends PGoal
{
    private final LinkedList<PCommands> _commands_ = new LinkedList<PCommands>();

    public ACmdsGoal()
    {
        // Constructor
    }

    public ACmdsGoal(
        @SuppressWarnings("hiding") List<?> _commands_)
    {
        // Constructor
        setCommands(_commands_);

    }

    @Override
    public Object clone()
    {
        return new ACmdsGoal(
            cloneList(this._commands_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACmdsGoal(this);
    }

    public LinkedList<PCommands> getCommands()
    {
        return this._commands_;
    }

    public void setCommands(List<?> list)
    {
        for(PCommands e : this._commands_)
        {
            e.parent(null);
        }
        this._commands_.clear();

        for(Object obj_e : list)
        {
            PCommands e = (PCommands) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._commands_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._commands_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._commands_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PCommands> i = this._commands_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PCommands) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}