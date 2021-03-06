// This is a generated file. Not intended for manual editing.
package com.github.syuchan1005.gitprefix.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.syuchan1005.gitprefix.psi.PrefixResourceTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.syuchan1005.gitprefix.psi.*;

public class PrefixResourcePropertyImpl extends ASTWrapperPsiElement implements PrefixResourceProperty {

  public PrefixResourcePropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PrefixResourceVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PrefixResourceVisitor) accept((PrefixResourceVisitor)visitor);
    else super.accept(visitor);
  }

}
