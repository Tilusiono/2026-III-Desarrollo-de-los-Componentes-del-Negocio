package com.inche.demo.clases;

import java.util.List;

public interface Notificacion {

    void notificarCambioTipoUsuario(Usuario usuario, TipoUsuario tipoUsuarioAnterior, TipoUsuario tipoUsuarioNuevo);

    boolean notificarMigraciondeUsuario(List<Usuario> usuarios,TipoUsuario tipoUsuarioAnterior, TipoUsuario tipoUsuarioNuevo);

}
