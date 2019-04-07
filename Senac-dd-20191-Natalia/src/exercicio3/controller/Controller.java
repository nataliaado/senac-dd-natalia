package exercicio3.controller;

import exercicio3.model.bo.UsuarioBO;
import exercicio3.model.vo.NivelVO;
import exercicio3.model.vo.UsuarioVO;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Controller {

	public String salvar(String nome, String email, NivelVO nivel, String senhaTentativa, String senhaConfirma) {
		String mensagem = "";

		if (nome == null || nome.trim().isEmpty()) {
			mensagem = "Preenche o nome";
		} else if (email == null || email.trim().isEmpty()) {
			mensagem = "Preenche o email";
		} else if (nivel == null) {
			mensagem = "Preenche o nivel";
		} else if (senhaTentativa == null || senhaTentativa.trim().isEmpty()) {
			mensagem = "Preenche a senha";
		} else if (senhaConfirma == null || senhaConfirma.trim().isEmpty()) {
			mensagem = "Preenche a senha de Confirma��o";
		} else if (senhaTentativa != senhaConfirma) {
			mensagem = "Senha incorreta, digite novamente";
		} else if (!senhaTentativa.equals(senhaConfirma)) {
			mensagem = "Senha incorreta, digite novamente!";
		} else if (mensagem.isEmpty()) {
			UsuarioBO usuarioBO = new UsuarioBO();
			mensagem = usuarioBO.salvar(nome, email, senhaTentativa, nivel);
		}
		return mensagem;
	}

	public String excluir(UsuarioVO usuarioVO, String email, String senha) {
		String mensagem = "";

		if (email == null || email.trim().isEmpty()) {
			mensagem = "Preenche o email";
		}
		if (senha == null || senha.trim().isEmpty()) {
			mensagem = "Preenche a senha";
		}
		if (mensagem.isEmpty()) {
			UsuarioVO usuarioNormal = new UsuarioVO();
			usuarioNormal.setId(usuarioVO.getId());

			UsuarioVO usuarioADM = new UsuarioVO();
			usuarioADM.setEmail(email);
			usuarioADM.setSenha(senha);

			UsuarioBO usuarioBO = new UsuarioBO();
			usuarioBO.excluir(usuarioNormal, usuarioADM);
		}
		return mensagem;
	}

	public ArrayList<UsuarioVO> listarPorNivel(NivelVO nivel) throws Exception {
		if (nivel == null) {
			JOptionPane.showMessageDialog(null, "Preenche o n�vel");
		}
		UsuarioBO usuarioBO = new UsuarioBO();
		usuarioBO.listarPorNivel(nivel);
		return usuarioBO.listarPorNivel(nivel);
	}

	public UsuarioVO listarPorNome(String nome) throws Exception {
		if (nome == null || nome.isEmpty() || nome.trim().length() < 3) {
			JOptionPane.showMessageDialog(null, "Nome de no m�nimo 3 caracteres");
		}
		UsuarioBO usuarioBO = new UsuarioBO();
		return usuarioBO.listarPorNome(nome);
	}

	public ArrayList<UsuarioVO> listarTodos() {
		UsuarioBO usuarioBO = new UsuarioBO();
		return usuarioBO.listarTodos();
	}
}
